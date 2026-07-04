package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.result.PageResult;
import com.sky.dto.DishPageQueryDTO;

import java.util.List;

import com.sky.vo.DishVO;

public interface DishService {



    void saveWithFlavor(DishDTO dishDTO);


    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    DishVO getByIdWithFlavor(Long id);

}
