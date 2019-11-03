package com.imooc.product.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;

@Getter
public enum  ResultEunm {
    PRODUCT_NO_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存不足"),
    ;
    private Integer code;

    private String message;

    ResultEunm(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
