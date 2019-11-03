package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

public class ResultVOUtils {

    public static ResultVO success(Object obejct){
        ResultVO resultVO = new ResultVO();
        resultVO.setDate(obejct);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;

    }
}
