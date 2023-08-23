package com.haidong.newseirmeng.dao;

import com.haidong.newseirmeng.entity.GoodsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsDao {

    // 插入 并查询id 赋给传入的对象
    @Insert("INSERT INTO goods(key, value) VALUES(#{key}, #{value})")
    @SelectKey(statement = "SELECT seq id FROM sqlite_sequence WHERE (name = 'goods')", before = false, keyProperty = "id", resultType = Long.class)
    int insert(GoodsEntity model);

    // 根据 ID 查询
    @Select("SELECT * FROM goods WHERE id=#{id}")
    GoodsEntity select(Long id);

    // 查询全部
    @Select("SELECT * FROM goods")
    List<GoodsEntity> selectAll();

    // 更新 value
    @Update("UPDATE goods SET value=#{value} WHERE id=#{id}")
    int updateValue(GoodsEntity model);

    // 根据 ID 删除
    @Delete("DELETE FROM goods WHERE id=#{id}")
    int delete(Long id);

    // 查询全部
    @Select("SELECT * FROM goods")
    List<GoodsEntity> list();

}