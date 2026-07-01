package com.sky.entity;

import java.io.Serializable;

/**
 * 菜品口味
 */
public class DishFlavor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    //菜品id
    private Long dishId;

    //口味名称
    private String name;

    //口味数据list
    private String value;

    public DishFlavor() {
    }

    public DishFlavor(Long id, Long dishId, String name, String value) {
        this.id = id;
        this.dishId = dishId;
        this.name = name;
        this.value = value;
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

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        private Long id;
        private Long dishId;
        private String name;
        private String value;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder dishId(Long dishId) {
            this.dishId = dishId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public DishFlavor build() {
            return new DishFlavor(id, dishId, name, value);
        }
    }
}