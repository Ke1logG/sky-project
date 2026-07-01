package com.sky.vo;

import java.io.Serializable;

/**
 * 订单概览数据
 */
public class OrderOverViewVO implements Serializable {
    //待接单数量
    private Integer waitingOrders;

    //待派送数量
    private Integer deliveredOrders;

    //已完成数量
    private Integer completedOrders;

    //已取消数量
    private Integer cancelledOrders;

    //全部订单
    private Integer allOrders;

    public OrderOverViewVO() {
    }

    public OrderOverViewVO(Integer waitingOrders, Integer deliveredOrders, Integer completedOrders, Integer cancelledOrders, Integer allOrders) {
        this.waitingOrders = waitingOrders;
        this.deliveredOrders = deliveredOrders;
        this.completedOrders = completedOrders;
        this.cancelledOrders = cancelledOrders;
        this.allOrders = allOrders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getWaitingOrders() {
        return waitingOrders;
    }

    public void setWaitingOrders(Integer waitingOrders) {
        this.waitingOrders = waitingOrders;
    }

    public Integer getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(Integer deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }

    public Integer getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(Integer completedOrders) {
        this.completedOrders = completedOrders;
    }

    public Integer getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(Integer cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    public Integer getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(Integer allOrders) {
        this.allOrders = allOrders;
    }

    public static class Builder {
        private Integer waitingOrders;
        private Integer deliveredOrders;
        private Integer completedOrders;
        private Integer cancelledOrders;
        private Integer allOrders;

        public Builder waitingOrders(Integer waitingOrders) {
            this.waitingOrders = waitingOrders;
            return this;
        }

        public Builder deliveredOrders(Integer deliveredOrders) {
            this.deliveredOrders = deliveredOrders;
            return this;
        }

        public Builder completedOrders(Integer completedOrders) {
            this.completedOrders = completedOrders;
            return this;
        }

        public Builder cancelledOrders(Integer cancelledOrders) {
            this.cancelledOrders = cancelledOrders;
            return this;
        }

        public Builder allOrders(Integer allOrders) {
            this.allOrders = allOrders;
            return this;
        }

        public OrderOverViewVO build() {
            return new OrderOverViewVO(waitingOrders, deliveredOrders, completedOrders, cancelledOrders, allOrders);
        }
    }
}