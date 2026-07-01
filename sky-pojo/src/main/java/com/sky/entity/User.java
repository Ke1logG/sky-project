package com.sky.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //微信用户唯一标识
    private String openid;

    //姓名
    private String name;

    //手机号
    private String phone;

    //性别 0 女 1 男
    private String sex;

    //身份证号
    private String idNumber;

    //头像
    private String avatar;

    //注册时间
    private LocalDateTime createTime;

    public User() {
    }

    public User(Long id, String openid, String name, String phone, String sex, String idNumber, String avatar, LocalDateTime createTime) {
        this.id = id;
        this.openid = openid;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.idNumber = idNumber;
        this.avatar = avatar;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public static class Builder {
        private Long id;
        private String openid;
        private String name;
        private String phone;
        private String sex;
        private String idNumber;
        private String avatar;
        private LocalDateTime createTime;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder openid(String openid) {
            this.openid = openid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder idNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public User build() {
            return new User(id, openid, name, phone, sex, idNumber, avatar, createTime);
        }
    }
}