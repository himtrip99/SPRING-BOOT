package com.business.producer.model;

import java.util.Date;
import java.util.List;

public class Order
{
    private String customerName;
    private String deliveryAddress;
    private Date date;
    private List<Item> orderItems;

    public Order(String customerName, Date date, String deliveryAddress, List<Item> orderItems) {
        this.customerName = customerName;
        this.date = date;
        this.deliveryAddress = deliveryAddress;
        this.orderItems = orderItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }
}
