package com.sky.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单
 */
public class Orders implements Serializable {

    /**
     * 订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消
     */
    public static final Integer PENDING_PAYMENT = 1;
    public static final Integer TO_BE_CONFIRMED = 2;
    public static final Integer CONFIRMED = 3;
    public static final Integer DELIVERY_IN_PROGRESS = 4;
    public static final Integer COMPLETED = 5;
    public static final Integer CANCELLED = 6;

    /**
     * 支付状态 0未支付 1已支付 2退款
     */
    public static final Integer UN_PAID = 0;
    public static final Integer PAID = 1;
    public static final Integer REFUND = 2;

    private static final long serialVersionUID = 1L;

    private Long id;

    //订单号
    private String number;

    //订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消 7退款
    private Integer status;

    //下单用户id
    private Long userId;

    //地址id
    private Long addressBookId;

    //下单时间
    private LocalDateTime orderTime;

    //结账时间
    private LocalDateTime checkoutTime;

    //支付方式 1微信，2支付宝
    private Integer payMethod;

    //支付状态 0未支付 1已支付 2退款
    private Integer payStatus;

    //实收金额
    private BigDecimal amount;

    //备注
    private String remark;

    //用户名
    private String userName;

    //手机号
    private String phone;

    //地址
    private String address;

    //收货人
    private String consignee;

    //订单取消原因
    private String cancelReason;

    //订单拒绝原因
    private String rejectionReason;

    //订单取消时间
    private LocalDateTime cancelTime;

    //预计送达时间
    private LocalDateTime estimatedDeliveryTime;

    //配送状态  1立即送出  0选择具体时间
    private Integer deliveryStatus;

    //送达时间
    private LocalDateTime deliveryTime;

    //打包费
    private int packAmount;

    //餐具数量
    private int tablewareNumber;

    //餐具数量状态  1按餐量提供  0选择具体数量
    private Integer tablewareStatus;

    public Orders() {
    }

    public Orders(Long id, String number, Integer status, Long userId, Long addressBookId, LocalDateTime orderTime, LocalDateTime checkoutTime, Integer payMethod, Integer payStatus, BigDecimal amount, String remark, String userName, String phone, String address, String consignee, String cancelReason, String rejectionReason, LocalDateTime cancelTime, LocalDateTime estimatedDeliveryTime, Integer deliveryStatus, LocalDateTime deliveryTime, int packAmount, int tablewareNumber, Integer tablewareStatus) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.userId = userId;
        this.addressBookId = addressBookId;
        this.orderTime = orderTime;
        this.checkoutTime = checkoutTime;
        this.payMethod = payMethod;
        this.payStatus = payStatus;
        this.amount = amount;
        this.remark = remark;
        this.userName = userName;
        this.phone = phone;
        this.address = address;
        this.consignee = consignee;
        this.cancelReason = cancelReason;
        this.rejectionReason = rejectionReason;
        this.cancelTime = cancelTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryStatus = deliveryStatus;
        this.deliveryTime = deliveryTime;
        this.packAmount = packAmount;
        this.tablewareNumber = tablewareNumber;
        this.tablewareStatus = tablewareStatus;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAddressBookId() {
        return addressBookId;
    }

    public void setAddressBookId(Long addressBookId) {
        this.addressBookId = addressBookId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDateTime getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(LocalDateTime checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public LocalDateTime getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(LocalDateTime cancelTime) {
        this.cancelTime = cancelTime;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getPackAmount() {
        return packAmount;
    }

    public void setPackAmount(int packAmount) {
        this.packAmount = packAmount;
    }

    public int getTablewareNumber() {
        return tablewareNumber;
    }

    public void setTablewareNumber(int tablewareNumber) {
        this.tablewareNumber = tablewareNumber;
    }

    public Integer getTablewareStatus() {
        return tablewareStatus;
    }

    public void setTablewareStatus(Integer tablewareStatus) {
        this.tablewareStatus = tablewareStatus;
    }

    public static class Builder {
        private Long id;
        private String number;
        private Integer status;
        private Long userId;
        private Long addressBookId;
        private LocalDateTime orderTime;
        private LocalDateTime checkoutTime;
        private Integer payMethod;
        private Integer payStatus;
        private BigDecimal amount;
        private String remark;
        private String userName;
        private String phone;
        private String address;
        private String consignee;
        private String cancelReason;
        private String rejectionReason;
        private LocalDateTime cancelTime;
        private LocalDateTime estimatedDeliveryTime;
        private Integer deliveryStatus;
        private LocalDateTime deliveryTime;
        private int packAmount;
        private int tablewareNumber;
        private Integer tablewareStatus;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder addressBookId(Long addressBookId) {
            this.addressBookId = addressBookId;
            return this;
        }

        public Builder orderTime(LocalDateTime orderTime) {
            this.orderTime = orderTime;
            return this;
        }

        public Builder checkoutTime(LocalDateTime checkoutTime) {
            this.checkoutTime = checkoutTime;
            return this;
        }

        public Builder payMethod(Integer payMethod) {
            this.payMethod = payMethod;
            return this;
        }

        public Builder payStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder consignee(String consignee) {
            this.consignee = consignee;
            return this;
        }

        public Builder cancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
            return this;
        }

        public Builder rejectionReason(String rejectionReason) {
            this.rejectionReason = rejectionReason;
            return this;
        }

        public Builder cancelTime(LocalDateTime cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }

        public Builder estimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
            this.estimatedDeliveryTime = estimatedDeliveryTime;
            return this;
        }

        public Builder deliveryStatus(Integer deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }

        public Builder deliveryTime(LocalDateTime deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        public Builder packAmount(int packAmount) {
            this.packAmount = packAmount;
            return this;
        }

        public Builder tablewareNumber(int tablewareNumber) {
            this.tablewareNumber = tablewareNumber;
            return this;
        }

        public Builder tablewareStatus(Integer tablewareStatus) {
            this.tablewareStatus = tablewareStatus;
            return this;
        }

        public Orders build() {
            return new Orders(id, number, status, userId, addressBookId, orderTime, checkoutTime, payMethod, payStatus, amount, remark, userName, phone, address, consignee, cancelReason, rejectionReason, cancelTime, estimatedDeliveryTime, deliveryStatus, deliveryTime, packAmount, tablewareNumber, tablewareStatus);
        }
    }
}