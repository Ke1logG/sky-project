package com.sky.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 */
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //名称
    private String name;

    //用户id
    private Long userId;

    //菜品id
    private Long dishId;

    //套餐id
    private Long setmealId;

    //口味
    private String dishFlavor;

    //数量
    private Integer number;

    //金额
    private BigDecimal amount;

    //图片
    private String image;

    private LocalDateTime createTime;

    public ShoppingCart() {
    }

    public ShoppingCart(Long id, String name, Long userId, Long dishId, Long setmealId, String dishFlavor, Integer number, BigDecimal amount, String image, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.dishId = dishId;
        this.setmealId = setmealId;
        this.dishFlavor = dishFlavor;
        this.number = number;
        this.amount = amount;
        this.image = image;
        this.createTime = createTime;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public Long getSetmealId() {
        return setmealId;
    }

    public void setSetmealId(Long setmealId) {
        this.setmealId = setmealId;
    }

    public String getDishFlavor() {
        return dishFlavor;
    }

    public void setDishFlavor(String dishFlavor) {
        this.dishFlavor = dishFlavor;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static class Builder {
        private Long id;
        private String name;
        private Long userId;
        private Long dishId;
        private Long setmealId;
        private String dishFlavor;
        private Integer number;
        private BigDecimal amount;
        private String image;
        private LocalDateTime createTime;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder dishId(Long dishId) {
            this.dishId = dishId;
            return this;
        }

        public Builder setmealId(Long setmealId) {
            this.setmealId = setmealId;
            return this;
        }

        public Builder dishFlavor(String dishFlavor) {
            this.dishFlavor = dishFlavor;
            return this;
        }

        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public ShoppingCart build() {
            return new ShoppingCart(id, name, userId, dishId, setmealId, dishFlavor, number, amount, image, createTime);
        }
    }
}