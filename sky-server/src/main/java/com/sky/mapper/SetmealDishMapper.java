package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.sky.entity.SetmealDish;
import java.util.List;


@Mapper
public interface SetmealDishMapper {



    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    
}
