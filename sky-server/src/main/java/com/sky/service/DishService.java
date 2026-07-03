package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.result.PageResult;
import com.sky.dto.DishPageQueryDTO;

public interface DishService {



    void saveWithFlavor(DishDTO dishDTO);


    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

}
