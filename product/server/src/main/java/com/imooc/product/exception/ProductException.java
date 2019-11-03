package com.imooc.product.exception;


import com.imooc.product.enums.ResultEunm;

public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }
    public ProductException(ResultEunm resultEunm){
        super(resultEunm.getMessage());
        this.code = resultEunm.getCode();
    }
}
