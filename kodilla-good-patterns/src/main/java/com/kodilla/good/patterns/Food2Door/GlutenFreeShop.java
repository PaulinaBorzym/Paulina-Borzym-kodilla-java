package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Sellers {
    private List<Product> products= new ArrayList<>();
    public GlutenFreeShop() {
        Product product1 = new Product();
        product1.setName("Banana");
        product1.setPrice(3.26);
        product1.setQuantity(4800);
        Product product2 = new Product();
        product2.setName("Banana juice");
        product2.setPrice(6.50);
        product2.setQuantity(840);
        products.add(product1);
        products.add(product2);
    }

    @Override
    public OrderRs process(Product product, User user) {
        Order order = new Order();
        return new OrderRs(order,true,"Order is correct");
    }
}
