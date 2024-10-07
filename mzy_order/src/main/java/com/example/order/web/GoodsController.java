package com.example.order.web;

import com.example.order.common.CommResult;
import com.example.order.service.GoodsOrderService;
import com.example.order.service.dto.GoodsOrderDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author mzy
 * @date 2024/7/29 0:12
 */
@Controller("/goods")
public class GoodsController {

    @Resource
    private GoodsOrderService goodsOrderService;

    @PostMapping("/addGoods")
    @ResponseBody
    public Long addGoods(@RequestBody GoodsOrderDTO goodsOrderDTO) {
        long insert = goodsOrderService.insert(goodsOrderDTO);

        return insert;
    }

}
