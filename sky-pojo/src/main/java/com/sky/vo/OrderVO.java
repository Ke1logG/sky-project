package com.sky.vo;

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import java.io.Serializable;
import java.util.List;

public class OrderVO extends Orders implements Serializable {

    //订单菜品信息
    private String orderDishes;

    //订单详情
    private List<OrderDetail> orderDetailList;

    public OrderVO() {
    }

    public OrderVO(String orderDishes, List<OrderDetail> orderDetailList) {
        this.orderDishes = orderDishes;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderDishes() {
        return orderDishes;
    }

    public void setOrderDishes(String orderDishes) {
        this.orderDishes = orderDishes;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}