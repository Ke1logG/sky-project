package com.sky.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 套餐
 */
public class Setmeal implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

    public Setmeal() {
    }

    public Setmeal(Long id, Long categoryId, String name, BigDecimal price, Integer status, String description, String image, LocalDateTime createTime, LocalDateTime updateTime, Long createUser, Long updateUser) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.status = status;
        this.description = description;
        this.image = image;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUser = createUser;
        this.updateUser = updateUser;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public static class Builder {
        private Long id;
        private Long categoryId;
        private String name;
        private BigDecimal price;
        private Integer status;
        private String description;
        private String image;
        private LocalDateTime createTime;
        private LocalDateTime updateTime;
        private Long createUser;
        private Long updateUser;

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

        public Builder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder updateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder createUser(Long createUser) {
            this.createUser = createUser;
            return this;
        }

        public Builder updateUser(Long updateUser) {
            this.updateUser = updateUser;
            return this;
        }

        public Setmeal build() {
            return new Setmeal(id, categoryId, name, price, status, description, image, createTime, updateTime, createUser, updateUser);
        }
    }
}