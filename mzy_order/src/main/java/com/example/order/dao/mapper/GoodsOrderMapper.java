package com.example.order.dao.mapper;

import com.example.order.dao.entity.GoodsOrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mzy
 * @date 2024/7/28 21:09
 */
@Mapper
public interface GoodsOrderMapper {

    void insertEntity(GoodsOrderEntity entity) ;


}
