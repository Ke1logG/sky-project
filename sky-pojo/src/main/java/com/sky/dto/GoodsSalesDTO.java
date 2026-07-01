package com.sky.dto;

import java.io.Serializable;

public class GoodsSalesDTO implements Serializable {
    //商品名称
    private String name;

    //销量
    private Integer number;

    public GoodsSalesDTO() {
    }

    public GoodsSalesDTO(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static class Builder {
        private String name;
        private Integer number;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder number(Integer number) {
            this.number = number;
            return this;
        }

        public GoodsSalesDTO build() {
            return new GoodsSalesDTO(name, number);
        }
    }
}