package com.wei.mao.file.wei;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/10  下午4:57
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        List<String> list = FileUtils.readLines(new File("/Users/maowei/Downloads/123.txt"));
        String[] str;
        List<Map<String,String>> data = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Map<String,String> map = new HashMap<>();
            str = list.get(i).split(",");
            map.put(str[0].substring(1,str[0].length()-1),str[1].substring(1,str[1].length()-1));
            data.add(map);
        }
        Map<Map<String,String>,Integer> result = new HashMap<>();
        for (Map item:data) {
            if (result.containsKey(item)){
                result.put(item,result.get(item)+1);
            }else {
                result.put(item,1);
            }
        }
//        for (Map.Entry<Map<String,String>,Integer> entry: result.entrySet()) {
//            if (entry.getValue() > 2){
//                FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/data.txt"),entry.getKey().getOrDefault() ,true);
//            }
//        }
        for (Map.Entry<Map<String,String>,Integer> entry: result.entrySet()) {
            FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/data.txt"), String.valueOf(entry.getKey())+"\n",true);
        }
//        System.out.println(result);
    }
}
