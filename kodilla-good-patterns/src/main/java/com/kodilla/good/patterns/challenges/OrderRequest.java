package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User buyer;
    private Product product;

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
