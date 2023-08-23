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
}
