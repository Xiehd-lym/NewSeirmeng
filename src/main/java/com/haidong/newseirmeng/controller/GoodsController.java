package com.haidong.newseirmeng.controller;

import com.haidong.newseirmeng.entity.GoodsEntity;
import com.haidong.newseirmeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public String hello() {
        return "index";
    }

    @PostMapping("/list")
    public List<GoodsEntity> list(){
        return goodsService.list();
    }

}
