package com.wei.mao.file.wei;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/13  下午4:31
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        List<String> list = FileUtils.readLines(new File("/Users/maowei/Downloads/q.txt"));
        Map<String,Integer> result = new HashMap<>();
        String str;
        for (String item:list
             ) {
//            str = item.replaceAll("[,\" ]","");
//            if (result.containsKey(str)){
//                result.put(str,result.get(str)+1);
//            }else {
//                result.put(str,1);
//            }
        }

//        for (Map.Entry<Map<String,String>,Integer> entry: result.entrySet()) {
//            if (entry.getValue() > 4){
//                FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/data.txt"),entry.getKey().getOrDefault() ,true);
//            }
//        }
        Map<String,Set<String>> mapSet = new HashMap<>();
        String data;
        String duid;
        String name;
        for (Map.Entry<String,Integer> entry: result.entrySet()) {
            if (entry.getValue() > 4){
                data = String.valueOf(entry.getKey());
                duid = data.substring(0,32);
                name = data.substring(32,data.length());
                if (mapSet.containsKey(duid)){
                    mapSet.get(duid).add(name);
                } else {
                    Set<String> set = new HashSet<>();
                    set.add(name);
                    mapSet.put(duid,set);
                }
//                FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/data.txt"), data.substring(0,32)+"\t"+data.substring(32,data.length())+"\n",true);
            }
        }

        for (Map.Entry<String,Set<String>> entry: mapSet.entrySet()){
            FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/name.txt"),entry+"\n",true);
        }
//        System.out.println(mapSet);
        System.out.println("done");
    }
}
