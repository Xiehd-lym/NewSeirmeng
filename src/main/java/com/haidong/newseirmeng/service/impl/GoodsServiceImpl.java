package com.haidong.newseirmeng.service.impl;

import com.haidong.newseirmeng.dao.GoodsDao;
import com.haidong.newseirmeng.entity.GoodsEntity;
import com.haidong.newseirmeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<GoodsEntity> list() {
        return goodsDao.list();
    }

    @Override
    public int insert(GoodsEntity model) {
        return goodsDao.insert(model);
    }

    @Override
    public int delete(Integer id) {
        return goodsDao.delete(id);
    }

    @Override
    public GoodsEntity load(Integer id) {
        return goodsDao.load(id);
    }

    @Override
    public int add(GoodsEntity demo) {
        return goodsDao.add(demo);
    }

    @Override
    public int update(GoodsEntity demo) {
        return goodsDao.update(demo);
    }
}
