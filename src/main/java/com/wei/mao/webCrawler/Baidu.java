package com.wei.mao.webCrawler;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wei.mao.dao.LaGouDao;
import com.wei.mao.pojo.Position;
import com.wei.mao.pojo.PositionAmount;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/5/2  16:20
 */
@Data
@Log4j2
public class Baidu {
    @Autowired
    LaGouDao laGouDao;
    public static JSONArray array = new JSONArray();
    public void setPosition(String[] kds,int pages,String category){
        for (int i = 0; i < kds.length; i++) {
            String kd = kds[i];
            for (int j = 1; j <= pages; j++) {
                String url = "https://www.lagou.com/jobs/positionAjax.json?needAddtionalResult=false&"+"kd="+kd+"&pn="+j;
                Optional<JSONObject> responseData = Utils.getResponse(url, 5000);
                if (responseData.isPresent()){
                    JSONArray data = responseData.get().getJSONArray("result");
                    save(data,kd,category);
                }
            }
        }

    }

    public void setPositionAmount(String[] kd){
        List<PositionAmount> list = new ArrayList<>();
        for (int i = 0; i < kd.length; i++) {
            String url = "https://www.lagou.com/jobs/positionAjax.json?needAddtionalResult=false&"+"kd="+kd[i];
            Optional<JSONObject> responseData = Utils.getResponse(url, 5000);
            if (responseData.isPresent()){
                PositionAmount positionAmount = new PositionAmount();
                positionAmount.setAmount(responseData.get().getInteger("totalCount"));
                positionAmount.setPosition(kd[i]);
                list.add(positionAmount);
            }
        }
        laGouDao.insertPositionAmount(list);
    }

    public void startWithMultiThread(String kd,int pages,String category) throws InterruptedException {
        /**
         * 创建线程池
         */
        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100, 2000, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        for (int i = 1; i <= pages; i++) {
            String url = "https://www.lagou.com/jobs/positionAjax.json?needAddtionalResult=false&"+"kd="+kd+"&pn="+i;
            MyTask task = new MyTask(url);
            executor.execute(task);
        }
        /**
         * 关闭线程池
         */
        executor.shutdown();
        /**
         * 设置线程池等待时间
         */
        executor.awaitTermination(100, TimeUnit.DAYS);
        save(array,kd,category);
    }

    public void save(JSONArray dataArrays,String kd,String category){
        List<Position> list = new ArrayList<>();
        for (int i = 0; i < dataArrays.size(); i++) {
            Position position = new Position();
            JSONObject data = dataArrays.getJSONObject(i);
            position.setPosition(kd);
            position.setEducation(data.getString("education"));
            position.setCompany(data.getString("companyShortName"));
            position.setWorkYear(data.getString("workYear"));
            position.setSalary(Utils.getSalary(data.getString("salary")));
            position.setCity(data.getString("city"));
            position.setCompanySize(data.getString("companySize"));
            position.setFinanceStage(data.getString("financeStage"));
            list.add(position);
        }
        if (category.equals("development")){
            laGouDao.insertDevelopment(list);
        } else {
            laGouDao.insertPosition(list);
        }

    }
}

class MyTask implements Runnable {
    private String url;

    public MyTask(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        Optional<JSONObject> responseData = Utils.getResponse(url, 5000);
        if (responseData.isPresent()){
            JSONArray data = responseData.get().getJSONArray("result");
            for (int i = 0; i < data.size(); i++) {
                Baidu.array.add(data.get(i));
            }
        }
    }
}
