package com.sky.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.sky.dto.DishDTO;
import com.sky.result.Result;
import com.sky.service.DishService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/admin/dish")
@Api("菜品相关接口")
public class DishController {

    @Autowired
    private DishService dishService;

    public Result save(@RequestBody DishDTO dishDTO){
        dishService.saveWithFlavor(dishDTO);
        return Result.success();
    }
    
}
