package com.wei.mao.dao;

import com.wei.mao.pojo.Position;
import com.wei.mao.pojo.PositionAmount;

import java.util.List;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/5/3  14:02
 */
public interface LaGouDao {
    boolean insertPosition(List<Position> list);
    boolean insertDevelopment(List<Position> list);
    boolean insertPositionAmount(List<PositionAmount> list);
}
