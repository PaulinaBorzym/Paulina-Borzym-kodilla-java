package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HealthyShop implements Sellers {
    private List<Product> products= new ArrayList<>();
    public HealthyShop(){
        Product product1 = new Product();
        product1.setName("Apple");
        product1.setPrice(1.20);
        product1.setQuantity(3000);
        Product product2 = new Product();
        product2.setName("Apple juice");
        product2.setPrice(3.50);
        product2.setQuantity(640);
        products.add(product1);
        products.add(product2);
    }

    @Override
    public OrderRs process(Product product, User user) {
        List<Product> orderProducts =  products.stream()
                .filter(p->p.getName().equals(product.getName()))
                .collect(Collectors.toList());
        Order order = new Order();
        order.setProduct(product);
        order.setBuyer(user);
        if (orderProducts.size()>0){
            return new OrderRs(order,true,"Success!");
        }else{
            return new OrderRs(order,false,"Error!");
        }

    }
}
