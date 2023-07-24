package com.haidong.newseirmeng.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haidong.newseirmeng.dao.GoodsDao;
import com.haidong.newseirmeng.entity.GoodsEntity;
import com.haidong.newseirmeng.service.GoodsService;
import org.springframework.stereotype.Service;

@Service("goodsService")
public class GoodsServiceImpl extends ServiceImpl<GoodsDao, GoodsEntity> implements GoodsService {
}
