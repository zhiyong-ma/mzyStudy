package com.example.order.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author mzy
 * @date 2024/7/29 0:04
 */
@Data
public class GoodsOrderDTO {

    private Integer goodsType;

    private LocalDateTime orderTime;

    private String orderCode;
}
