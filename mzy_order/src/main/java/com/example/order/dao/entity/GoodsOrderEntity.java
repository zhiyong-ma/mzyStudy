package com.example.order.dao.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author mzy
 * @date 2024/7/28 21:10
 */
@Data
public class GoodsOrderEntity {

    private Long id;

    private Integer goodsType;

    private LocalDateTime orderTime;

    private String orderCode;


}
