package com.haidong.newseirmeng.controller;

import com.haidong.newseirmeng.entity.GoodsEntity;
import com.haidong.newseirmeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
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

    @PostMapping("/add")
    public int add(@RequestBody GoodsEntity demo){
        return goodsService.add(demo);
    }

    @GetMapping("/delete")
    public int delete(@RequestParam Integer id ){
        return goodsService.delete(id);
    }

    @GetMapping("/load")
    public GoodsEntity load(@RequestParam Integer id ){
        return goodsService.load(id);
    }

    @PostMapping("/update")
    public int update(@RequestBody GoodsEntity demo){
        return goodsService.update(demo);
    }

    @PostMapping("/show")
    public List<GoodsEntity> show(@RequestBody GoodsEntity demo){
        return goodsService.show(demo);
    }

}
