package com.example.order.common.enums;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mzy
 * @date 2024/7/29 0:07
 */
@Getter
public enum GoodsType {

    HAT(1,"帽子"),

    SHORT_SLEEVE(2,"短袖")

    ;

    private Integer code;

    private String desc;

    GoodsType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
