package com.wei.mao.dao;

import com.wei.mao.pojo.Theme;
import com.wei.mao.pojo.User;

import java.util.List;
import java.util.Set;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 16/12/9  上午9:36
 */
public interface VoiceDao {
//    public List<String> queryAll(@Param("from") int from, @Param("to") int to);

//    public boolean insertBash(List<String> list);
//
//    public List<String> queryAll();
    public List<String> query(String name);

    public List<Theme> queryTheme();

    public Set<String> queryCategory();

    public boolean insertBash(List<User> list);
}
