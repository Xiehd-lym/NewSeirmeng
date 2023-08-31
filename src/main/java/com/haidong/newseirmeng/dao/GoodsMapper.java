package com.haidong.newseirmeng.dao;

import com.haidong.newseirmeng.entity.GoodsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsMapper {

    @Select("select * from goods")
    List<GoodsEntity> list();

    @Insert("insert into goods(name,num) values(#{name,jdbcType=VARCHAR},#{num,jdbcType=INTEGER})")
    int insert(GoodsEntity goods);

    @Delete("delete from goods where id = #{id,jdbcType=INTEGER}")
    int delete(Integer id);

    @Select("select * from goods where id = #{id,jdbcType=INTEGER}")
    GoodsEntity load(Integer id);

    @Insert("insert into goods(name,num) values(#{name,jdbcType=VARCHAR},#{num,jdbcType=INTEGER})")
    int add(GoodsEntity demo);

    @Update("update goods set name = #{name,jdbcType=VARCHAR},num = #{num,jdbcType=INTEGER} where id = #{id,jdbcType=INTEGER}")
    int update(GoodsEntity demo);

    List<GoodsEntity> show(GoodsEntity demo);

}