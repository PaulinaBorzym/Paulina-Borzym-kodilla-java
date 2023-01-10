package com.kodilla.good.patterns.Food2Door;

public class OrderRs {
    private Order order;
    private boolean isOrderCorrect;
    private String info;

    public OrderRs(Order order, boolean isOrderCorrect, String info) {
        this.order = order;
        this.isOrderCorrect = isOrderCorrect;
        this.info = info;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isOrderCorrect() {
        return isOrderCorrect;
    }

    public void setOrderCorrect(boolean orderCorrect) {
        isOrderCorrect = orderCorrect;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
