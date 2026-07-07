package com.sky.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.mapper.DishMapper;
import com.sky.result.PageResult;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.BeanUtils;
import com.sky.entity.Dish;
import com.sky.mapper.DishFlavorMapper;
import com.sky.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;
import com.sky.vo.DishVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.Page;
import com.sky.constant.MessageConstant;
import com.sky.constant.StatusConstant;
import com.sky.exception.DeletionNotAllowedException;
import com.sky.mapper.SetmealDishMapper;



import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.service.DishService;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private DishFlavorMapper dishFlavorMapper;
    @Autowired
    private SetmealDishMapper setmealDishMapper;

    @Transactional
    @Override
    public void saveWithFlavor(DishDTO dishDTO){
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO,dish);
        dishMapper.insert(dish);
        Long dishId = dish.getId();

        List<DishFlavor> flavors = dishDTO.getFlavors();
        if(flavors != null && flavors.size()>0){
            flavors.forEach(dishFlavor -> {
                dishFlavor.setDishId(dishId);
            });
            
            dishFlavorMapper.insertBatch(flavors);
        }


    }


    @Override
    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO){
        PageHelper.startPage(dishPageQueryDTO.getPage(),dishPageQueryDTO.getPageSize());
        Page<DishVO> page = dishMapper.pageQuery(dishPageQueryDTO);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Transactional
    @Override
    public void deleteBatch(List<Long> ids){
        //判断是否有起售中的菜品
        for (Long id : ids) {
            Dish dish = dishMapper.getById(id);
            if(dish.getStatus() == StatusConstant.ENABLE){
                throw new DeletionNotAllowedException(MessageConstant.DISH_ON_SALE);
            }
        }
        
        //判断菜品是否被套餐关联了
        List<Long> setmealIds = setmealDishMapper.getSetmealIdsByDishIds(ids);
        if(setmealIds != null && setmealIds.size() > 0){
            throw new DeletionNotAllowedException(MessageConstant.DISH_BE_RELATED_BY_SETMEAL);
        }

        //删除菜品
        for (Long id : ids) {
            dishMapper.deleteById(id);
            //删除菜品口味
            dishFlavorMapper.deleteByDishId(id);
        }

    }

    @Override
    public DishVO getByIdWithFlavor(Long id){
        //根据id查询菜品数据
        Dish dish = dishMapper.getById(id);
        //根据菜品id查询口味数据
        List<DishFlavor> dishFlavor = dishFlavorMapper.getByDishId(id);
        //封装进VO对象
        DishVO dishVO = new DishVO();
        BeanUtils.copyProperties(dish,dishVO);
        dishVO.setFlavors(dishFlavor);
        return dishVO;
    }

    @Override
    public void updateWithFlavor(DishDTO dishDTO){
        //修改菜品表基本信息
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO, dish);
        dishMapper.update(dish);

        //删除原有的口味数据
        dishFlavorMapper.deleteByDishId(dishDTO.getId());
        //重新插入口味数据
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if(flavors != null && flavors.size()>0){
            flavors.forEach(dishFlavor -> {
                dishFlavor.setDishId(dishDTO.getId());
            });
            
            dishFlavorMapper.insertBatch(flavors);
        }

    }

    @Override
    public List<DishVO> listWithFlavor(Dish dish) {
    List<Dish> dishList = dishMapper.list(dish);

    List<DishVO> dishVOList = new ArrayList<>();

    for (Dish d : dishList) {
        DishVO dishVO = new DishVO();
        BeanUtils.copyProperties(d,dishVO);

        //根据菜品id查询对应的口味
        List<DishFlavor> flavors = dishFlavorMapper.getByDishId(d.getId());

        dishVO.setFlavors(flavors);
        dishVOList.add(dishVO);
    }

    return dishVOList;
}

    @Override
    public List<Dish> list(Long categoryId){
        Dish dish = Dish.builder()
            .categoryId(categoryId)
            .status(StatusConstant.ENABLE)
            .build();
        return dishMapper.list(dish);
        
    }


}
