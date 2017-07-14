package com.wei.mao.file.wei;

import com.wei.mao.dao.VoiceDao;
import com.wei.mao.pojo.Category;
import com.wei.mao.pojo.Theme;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/3/13  下午6:10
 */
public class demo3 {
    @Autowired
    VoiceDao dao;

    List<Theme> themes = new ArrayList<>();
    List<Category> categories = new ArrayList<>();

    public void loadData(){
        themes = dao.queryTheme();
//        categories = dao.queryCategory();
//        printName();
    }
    public void printName(){
//        for (Theme theme:themes) {
//            String name = theme.getName();
//            if (name.equals("FranceFootball")) {
//                System.out.println("-----"+name);
//            }
//        }
        Set<Integer> ids = new HashSet<>();
        Set<String> categorys = new HashSet<>();
        ids.add(7);
        ids.add(40);
        for (Category category:categories) {
            if (ids.contains(category.getId())){
                categorys.add(category.getName());
            }
        }
        System.out.println(categorys);
//        System.out.println("---------------");
//        for (Theme theme:themes) {
//            System.out.println(theme.getName());
//        }
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

    public void query() throws IOException {
        List<String> list = FileUtils.readLines(new File("/Users/maowei/Downloads/q.txt"));
        Map<String,Integer> result = new HashMap<>();
        String str;
        for (String item:list) {
            str = item.replaceAll("[,\" ]","");
            if (result.containsKey(str)){
                result.put(str,result.get(str)+1);
            }else {
                result.put(str,1);
            }
        }

        Map<String,Set<String>> mapSet1 = analyse1(result);
        Map<String,Set<String>> mapSet2 = analyse2(result);

        save("data1",mapSet1);
        save("data2",mapSet2);
    }




    public Map<String,Set<String>> analyse1(Map<String,Integer> result){
        Map<String,Set<String>> mapSet = new HashMap<>();
        String data;
        String duid;
        String name;
        for (Map.Entry<String,Integer> entry: result.entrySet()) {
            if (entry.getValue() > 4){
                data = String.valueOf(entry.getKey());
                duid = data.substring(0,32);
                name = data.substring(32,data.length());
                List<String> themeName = dao.query(name);
                if (mapSet.containsKey(duid)){
                    mapSet.get(duid).addAll(themeName);
                } else {
                    Set<String> set = new HashSet<>(themeName);
                    mapSet.put(duid,set);
                }
            }
        }
        return mapSet;
    }

    public Map<String,Set<String>> analyse2(Map<String,Integer> result){
        Map<String,Set<String>> mapSet = new HashMap<>();
        String data;
        String duid;
        String name;
        for (Map.Entry<String,Integer> entry: result.entrySet()) {
            if (entry.getValue() > 4){
                data = String.valueOf(entry.getKey());
                duid = data.substring(0,32);
                name = data.substring(32,data.length());
                Set<String> categorys = getCategoryByName(name);
                if (mapSet.containsKey(duid)){
                    mapSet.get(duid).addAll(categorys);
                } else {
                    mapSet.put(duid,categorys);
                }
            }
        }
        return mapSet;
    }

    public void save (String name, Map<String,Set<String>> mapSet) throws IOException {
        for (Map.Entry<String,Set<String>> entry: mapSet.entrySet()){
            if (!entry.getValue().isEmpty()){
                FileUtils.writeStringToFile(new File("/Users/maowei/Downloads/"+name+".txt"),entry+"\n",true);
            }
        }
    }

    public void test() throws IOException {
        Set<String> category = dao.queryCategory();
        System.out.println(category);
    }
}
