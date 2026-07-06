package com.sky.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;

import com.sky.result.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController("userShopController")
@RequestMapping("/user/shop")
@Api(tags = "店铺相关接口")
public class ShopController {

    public final String KEY = "SHOP_STATUS";

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/status")
    @ApiOperation("查询店铺营业状态")
    public Result<Integer> getStatus(){
        Integer status = (Integer)redisTemplate.opsForValue().get(KEY);
        return Result.success(status);
    }

}

