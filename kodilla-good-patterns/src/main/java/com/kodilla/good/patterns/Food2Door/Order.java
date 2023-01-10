package com.kodilla.good.patterns.Food2Door;

public class Order {
    User buyer = new User();
    Product product = new Product();

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
