package com.example.order.service;
import java.time.LocalDateTime;

import com.example.order.dao.entity.GoodsOrderEntity;
import com.example.order.dao.mapper.GoodsOrderMapper;
import com.example.order.service.dto.GoodsOrderDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mzy
 * @date 2024/7/29 0:03
 */
@Service
public class GoodsOrderService {

    @Resource
    private GoodsOrderMapper goodsOrderMapper;

    public long insert(GoodsOrderDTO goodsOrder){
        GoodsOrderEntity convert = convert(goodsOrder);
        goodsOrderMapper.insertEntity(convert);
        return convert.getId();
    }

    private GoodsOrderEntity convert(GoodsOrderDTO dto) {

        GoodsOrderEntity entity = new GoodsOrderEntity();
        entity.setGoodsType(dto.getGoodsType());
        entity.setOrderTime(dto.getOrderTime());
        entity.setOrderCode(dto.getOrderCode());
        return entity;
    }
}
