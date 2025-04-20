package com.gcu.model;

public class OrderModel {
    private String id;
    private String orderNo;
    private String productName;
    private double price;
    private int quantity;

    public OrderModel() {
        this.id = "";
        this.orderNo = "";
        this.productName = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public OrderModel(String id, String orderNo, String productName, double price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getOrderNo() { return orderNo; }
    public void setOrderNo(String orderNo) { this.orderNo = orderNo; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}