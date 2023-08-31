package com.haidong.newseirmeng.service;

import com.haidong.newseirmeng.entity.GoodsEntity;

import java.util.List;

public interface GoodsService {
    List<GoodsEntity> list();

    int insert(GoodsEntity model);

    int delete(Integer id);

    GoodsEntity load(Integer id);

    int add(GoodsEntity demo);

    int update(GoodsEntity demo);

    List<GoodsEntity>  show(GoodsEntity demo);

}
