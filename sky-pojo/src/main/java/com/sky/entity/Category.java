package com.sky.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //类型: 1菜品分类 2套餐分类
    private Integer type;

    //分类名称
    private String name;

    //顺序
    private Integer sort;

    //分类状态 0标识禁用 1表示启用
    private Integer status;

    //创建时间
    private LocalDateTime createTime;

    //更新时间
    private LocalDateTime updateTime;

    //创建人
    private Long createUser;

    //修改人
    private Long updateUser;

    public Category() {
    }

    public Category(Long id, Integer type, String name, Integer sort, Integer status, LocalDateTime createTime, LocalDateTime updateTime, Long createUser, Long updateUser) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.sort = sort;
        this.status = status;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        private Integer type;
        private String name;
        private Integer sort;
        private Integer status;
        private LocalDateTime createTime;
        private LocalDateTime updateTime;
        private Long createUser;
        private Long updateUser;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sort(Integer sort) {
            this.sort = sort;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
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

        public Category build() {
            return new Category(id, type, name, sort, status, createTime, updateTime, createUser, updateUser);
        }
    }
}