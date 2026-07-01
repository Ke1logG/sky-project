package com.sky.vo;

import java.io.Serializable;

/**
 * 套餐总览
 */
public class SetmealOverViewVO implements Serializable {
    // 已启售数量
    private Integer sold;

    // 已停售数量
    private Integer discontinued;

    public SetmealOverViewVO() {
    }

    public SetmealOverViewVO(Integer sold, Integer discontinued) {
        this.sold = sold;
        this.discontinued = discontinued;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }

    public static class Builder {
        private Integer sold;
        private Integer discontinued;

        public Builder sold(Integer sold) {
            this.sold = sold;
            return this;
        }

        public Builder discontinued(Integer discontinued) {
            this.discontinued = discontinued;
            return this;
        }

        public SetmealOverViewVO build() {
            return new SetmealOverViewVO(sold, discontinued);
        }
    }
}