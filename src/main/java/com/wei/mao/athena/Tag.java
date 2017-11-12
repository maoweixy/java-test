package com.wei.mao.athena;

import com.wei.mao.dao.VoiceDao;
import com.wei.mao.pojo.Category;
import com.wei.mao.pojo.Theme;
import com.wei.mao.pojo.User;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.*;


/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/10  下午5:13
 */
@Log4j2
@Data
public class Tag {
    @Autowired
    VoiceDao dao;

    List<Theme> themes = new ArrayList<>();
    List<Category> categories = new ArrayList<>();

    public void loadData(){
        themes = dao.queryTheme();
//        categories = dao.queryCategory();
    }

    public Set<String> getCategoryByName(String name){
        Set<Integer> ids = new HashSet<>();
        Set<String> categorys = new HashSet<>();
        for (Theme theme:themes) {
            if (theme.getName().equals(name)){
                ids.add(theme.getId());
            }
        }
        for (Category category:categories) {
            if (ids.contains(category.getId())){
                categorys.add(category.getName());
            }
        }
        return categorys;
    }

    public void test(String fileName) throws IOException {
//        //读取click数据
//        Map<String,Integer> click = readClick(fileName);
//        //读取download数据
//        Set<String> download = readDownload(fileName);
//        //合并且存储
//        saveDownloadAndClick(click,download);
        //分析
        Map<String,Set<String>> mapSet = analyseFromFile(fileName);
        //存储
        save(mapSet,fileName);
    }


    public Map<String,Integer> readClick(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-click.txt")));
        Map<String,Integer> click = new HashMap<>();
        String data;
        int flag = 0;
        for(String line; (line = br.readLine()) != null; ) {
            data = line.replaceAll("[,\" ]","");
            if (click.containsKey(data)){
                click.put(data,click.get(data)+1);
            }else {
                click.put(data,1);
            }
            flag++;
            if (flag == 5000000){
                log.info("已读取5000000行");
                flag = 0;
            }
        }
        log.info("已读取"+flag+"行");
        log.info(fileName+"读取点击数据完毕!  click数据一共"+click.size());
        return click;
    }

    public Set<String> readDownload(String fileName) throws IOException {
        String data;
        int flag = 0;
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-download.txt")));
        Set<String> download = new HashSet<>();
        for(String line ; (line = br.readLine()) != null; ) {
            data = line.replaceAll("[,\" ]","");
            download.add(data);
            flag++;
            if (flag == 5000000){
                log.info("已读取5000000行");
                flag = 0;
            }
        }
        log.info("已读取"+flag+"行");
        log.info(fileName+"读取下载数据完毕!  download数据有"+download.size());
        return download;
    }

//    public Set<String> mergeDownloadAndClick(Map<String,Integer> click,Set<String> download){
//        for (Map.Entry<String,Integer> entry:click.entrySet()) {
//            if (entry.getValue() > 4){
//                download.add(entry.getKey());
//            }
//        }
//        log.info("合并后的数据有: "+download.size());
//        return download;
//    }

    public void saveDownloadAndClick(Map<String,Integer> click,Set<String> download) throws IOException {
        log.info("进入saveDownloadAndClick");
        for (Map.Entry<String,Integer> entry:click.entrySet()) {
            if (entry.getValue() > 4){
                download.add(entry.getKey());
            }
        }
        log.info("合并后的数据有: "+download.size());
        log.info("开始存储合并后的数据");
        saveSet(download,"kika-tem.txt");
    }

    public Map<String,Set<String>> analyseSet(Set<String> download,String fileName){
        int flag = 0;
        String duid;
        String name;
        Map<String,Set<String>> result = new HashMap<>();
        for (String item:download) {
            flag++;
            duid = item.substring(0,32);
            name = item.substring(32,item.length());
            Set<String> categorys = getCategoryByName(name);
            if (result.containsKey(duid)){
                result.get(duid).addAll(categorys);
            } else {
                result.put(duid,categorys);
            }
            if (flag == 1000000){
                log.info("已解析1000000行");
                flag = 1;
            }
        }
        log.info("已解析"+flag+"行");
        log.info(fileName+"解析下载数据完毕!");
        return result;
    }

    public Map<String,Set<String>> analyseFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-tem.txt")));
        int flag = 0;
        String duid;
        String name;
        Map<String,Set<String>> result = new HashMap<>();
        for(String line; (line = br.readLine()) != null; ) {
            duid = line.substring(0,32);
            name = line.substring(32,line.length());
            Set<String> categorys = getCategoryByName(name);
            if (result.containsKey(duid)){
                result.get(duid).addAll(categorys);
            } else {
                result.put(duid,categorys);
            }
            flag++;
            if (flag == 1000000){
                log.info("已解析1000000行");
                flag = 0;
            }
        }
        log.info("已解析"+flag+"行");
        log.info(fileName+"解析下载数据完毕!");
        return result;
    }

    public void save(Map<String,Set<String>> result, String fileName) throws IOException {
        int flag = 0;
        for (Map.Entry<String,Set<String>> entry: result.entrySet()){
            flag++;
            if (!entry.getValue().isEmpty()){
                FileUtils.writeStringToFile(new File("/home/maowei/backend-operation-push/"+fileName+"-tag.txt"),entry+"\n",true);
            }
            if (flag == 1000000){
                log.info("已存储1000000行");
                flag = 1;
            }
        }
        log.info("已存储"+flag+"行");
        log.info(fileName+"存储数据完毕!");
    }

    public void saveClick(String fileName) throws IOException {
        //读取click数据
        Map<String,Integer> click = readClick(fileName);

        //解析click数据
        String duidAndName;
        String duid;
        String name;
        int flag = 1;
        Map<String,Set<String>> result = new HashMap<>();
        for (Map.Entry<String,Integer> entry:click.entrySet()) {
            flag++;
            if (entry.getValue() > 4){
                duidAndName = String.valueOf(entry.getKey());
                duid = duidAndName.substring(0,32);
                name = duidAndName.substring(32,duidAndName.length());
                Set<String> categorys = getCategoryByName(name);
                if (result.containsKey(duid)){
                    result.get(duid).addAll(categorys);
                } else {
                    result.put(duid,categorys);
                }
            }
            if (flag == 5000000){
                log.info("已解析5000000行");
                flag = 1;
            }
        }
        log.info("已解析"+flag+"行");
        log.info(fileName+"解析点击数据完毕!");
        click = null;

        //存储数据到tem1
        saveHash(result,fileName+"-tem1.txt");
    }

    public void saveDownload(String fileName) throws IOException {
        //读取download数据
        Set<String> download = readDownload(fileName);

        //解析download数据
        Map<String,Set<String>> mapSet = analyseSet(download,fileName);

        //存储数据到tem2
        saveHash(mapSet,fileName+"-tem2.txt");
    }

    public void saveTotal(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-tem1.txt")));
        Set<String> result = new HashSet<>();
        int flag = 1;
        for(String line; (line = br.readLine()) != null; ) {
            flag++;
            result.add(line);
            if (flag == 1000000){
                log.info("已读取1000000行");
                flag = 1;
            }
        }
        log.info("已读取"+flag+"行");
        log.info(fileName+"-tem1读取点击数据完毕!");

        br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-tem2.txt")));
        flag = 1;
        for(String line; (line = br.readLine()) != null; ) {
            flag++;
            result.add(line);
            if (flag == 1000000){
                log.info("已读取1000000行");
                flag = 1;
            }
        }
        log.info("已读取"+flag+"行");
        log.info(fileName+"-tem2读取点击数据完毕!");

        /**
         * 存储最终数据
         */
        saveSet(result,fileName+"-tag.txt");
    }

    public void saveSet(Set<String> result, String fileName) throws IOException {
        int flag = 0;
        for (String item:result) {
            FileUtils.writeStringToFile(new File("/home/maowei/backend-operation-push/"+fileName),item+"\n",true);
            flag++;
            if (flag == 1000000){
                log.info("已存储1000000行");
                flag = 0;
            }
        }
        log.info("已存储"+flag+"行");
        log.info(fileName+"存储完毕!");
    }

    public void saveHash(Map<String,Set<String>> result, String fileName) throws IOException {
        int flag = 1;
        for (Map.Entry<String,Set<String>> entry: result.entrySet()){
            flag++;
            if (!entry.getValue().isEmpty()){
                FileUtils.writeStringToFile(new File("/home/maowei/backend-operation-push/"+fileName),entry+"\n",true);
            }
            if (flag == 1000000){
                log.info("已存储1000000行");
                flag = 1;
            }
        }
        log.info("已存储"+flag+"行");
        log.info(fileName+"存储数据完毕!");
    }

    public void find(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-click.txt")));
        Map<String,Integer> click = new HashMap<>();
        String data;
        int flag = 1;
        for(String line; (line = br.readLine()) != null; ) {
            flag++;
            data = line.replaceAll("[,\" ]","");
            if (data.length() < 32){
                log.info("字符串出错在"+fileName+"click:   "+flag);
            }
            flag++;
        }
        br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/"+fileName+"-download.txt")));
        flag = 1;
        for(String line; (line = br.readLine()) != null; ) {
            flag++;
            data = line.replaceAll("[,\" ]","");
            if (data.length() < 32){
                log.info("字符串出错在"+fileName+"download:   "+flag);
            }
            flag++;
        }
    }

    public void insertIntoDatabase(String fileName) throws IOException {
        log.info("开始存储"+fileName);
        BufferedReader br = new BufferedReader(new FileReader(new File("/home/maowei/backend-operation-push/data/"+fileName+"-tag.txt")));
        List<User> list = new ArrayList<>();
        for(String line; (line = br.readLine()) != null; ) {
            User user = new User();
            user.setDuid(line.substring(0,32));
            //user.setTag(toStr(line.substring(34,line.length()-1)));
            user.setApp_name(fileName);
            list.add(user);
            if (list.size() == 50000){
                dao.insertBash(list);
                log.info("已存储50000行");
                list = new ArrayList<>();
            }
        }
        if (list.size() != 0){
            dao.insertBash(list);
            log.info("已存储"+list.size()+"行");
        }
        log.info("结束存储"+fileName);
    }

    public String toStr(String string){
        String[] strings = string.split(",");
        String ret = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (i > 0){
                ret+=","+strings[i].replaceFirst(" ","");
            }
        }
        return ret;
    }

    public void getDataByJDBC(){
        String sql = "select deviceuid,json_extract_scalar(extra,'$.n') from gimbal.event\n" +
                "where app_key='e2934742f9d3b8ef2b59806a041ab389' and cdate = 20170302 and \n" +
                "event_part='other' and\n" +
                "opertype='item' and\n" +
                "item='download' and\n" +
                "(layout='theme_detail' or\n" +
                "layout='theme_online' or\n" +
                "layout='home')";
        List<String[]> list = AthenaUtils.executeSql(sql);
        log.info("开始输出下载");
        for (String[] strs:list){
            log.info(strs[0]+"  "+strs[1]);
        }
        log.info("开始输出点击");
        sql = "select deviceuid,json_extract_scalar(extra,'$.n') from gimbal.event\n" +
                "where app_key='e2934742f9d3b8ef2b59806a041ab389' and cdate between 20170302 and 20170308 and \n" +
                "event_part='other' and\n" +
                "opertype='item' and\n" +
                "((layout='theme_category_details' and item='cate_theme') or\n" +
                "(layout='home' and item='card') or\n" +
                "(layout='theme_online' and item='button'))";
        list = AthenaUtils.executeSql(sql);
        for (String[] strs:list){
            log.info(strs[0]+"  "+strs[1]);
        }
    }
}
