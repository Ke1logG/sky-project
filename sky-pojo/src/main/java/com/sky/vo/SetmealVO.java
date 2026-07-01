package com.sky.vo;

import com.sky.entity.SetmealDish;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SetmealVO implements Serializable {

    private Long id;

    //分类id
    private Long categoryId;

    //套餐名称
    private String name;

    //套餐价格
    private BigDecimal price;

    //状态 0:停用 1:启用
    private Integer status;

    //描述信息
    private String description;

    //图片
    private String image;

    //更新时间
    private LocalDateTime updateTime;

    //分类名称
    private String categoryName;

    //套餐和菜品的关联关系
    private List<SetmealDish> setmealDishes = new ArrayList<>();

    public SetmealVO() {
    }

    public SetmealVO(Long id, Long categoryId, String name, BigDecimal price, Integer status, String description, String image, LocalDateTime updateTime, String categoryName, List<SetmealDish> setmealDishes) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.status = status;
        this.description = description;
        this.image = image;
        this.updateTime = updateTime;
        this.categoryName = categoryName;
        this.setmealDishes = setmealDishes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<SetmealDish> getSetmealDishes() {
        return setmealDishes;
    }

    public void setSetmealDishes(List<SetmealDish> setmealDishes) {
        this.setmealDishes = setmealDishes;
    }

    public static class Builder {
        private Long id;
        private Long categoryId;
        private String name;
        private BigDecimal price;
        private Integer status;
        private String description;
        private String image;
        private LocalDateTime updateTime;
        private String categoryName;
        private List<SetmealDish> setmealDishes = new ArrayList<>();

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder updateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public Builder setmealDishes(List<SetmealDish> setmealDishes) {
            this.setmealDishes = setmealDishes;
            return this;
        }

        public SetmealVO build() {
            return new SetmealVO(id, categoryId, name, price, status, description, image, updateTime, categoryName, setmealDishes);
        }
    }
}