package com.haidong.newseirmeng.service.impl;

import com.haidong.newseirmeng.dao.GoodsMapper;
import com.haidong.newseirmeng.entity.GoodsEntity;
import com.haidong.newseirmeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsEntity> list() {
        return goodsMapper.list();
    }

    @Override
    public int insert(GoodsEntity model) {
        return goodsMapper.insert(model);
    }

    @Override
    public int delete(Integer id) {
        return goodsMapper.delete(id);
    }

    @Override
    public GoodsEntity load(Integer id) {
        return goodsMapper.load(id);
    }

    @Override
    public int add(GoodsEntity demo) {
        return goodsMapper.add(demo);
    }

    @Override
    public int update(GoodsEntity demo) {
        return goodsMapper.update(demo);
    }

    @Override
    public List<GoodsEntity> show(GoodsEntity demo) {
        List<GoodsEntity> show = goodsMapper.show(demo);
        show.stream().forEach(System.out::println);
        return show;
    }

}
