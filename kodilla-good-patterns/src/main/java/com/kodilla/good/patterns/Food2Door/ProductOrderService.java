package com.kodilla.good.patterns.Food2Door;

public class ProductOrderService {
    private Sellers sellers;


    public ProductOrderService (final Sellers sellers){
        this.sellers = sellers;
    }

    public void orderProcess(Product product, User user){
        OrderRs orderRs = sellers.process(product, user);
        System.out.println("Order status: " + orderRs.getInfo());
    }
}
