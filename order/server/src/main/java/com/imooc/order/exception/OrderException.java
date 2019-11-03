package com.imooc.order.exception;

import com.google.common.xml.XmlEscapers;
import com.imooc.order.enums.ResultEnum;
import org.aspectj.bridge.IMessage;

public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(Integer code,String message) {
        super(message);
        this.code = code;
    }
    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
