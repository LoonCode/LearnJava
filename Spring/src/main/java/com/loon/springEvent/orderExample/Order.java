package com.loon.springEvent.orderExample;

import java.util.Date;

/**
 * Created by Loon on 2015/11/12.
 */
public class Order {

    private String orderId;

    private String orderName;

    private Date createTime;

    public Order(String orderId, String orderName, Date createTime) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
