package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.sky.entity.DishFlavor;
import java.util.List;

@Mapper
public interface DishFlavorMapper {

    void insertBatch(List<DishFlavor> flavors);
    
}
