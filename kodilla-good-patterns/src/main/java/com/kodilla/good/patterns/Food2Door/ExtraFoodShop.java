package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraFoodShop implements Sellers {
    private List<Product> products= new ArrayList<>();
    public ExtraFoodShop(){
        Product product1 = new Product();
        product1.setName("Orange");
        product1.setPrice(2.20);
        product1.setQuantity(200);
        Product product2 = new Product();
        product2.setName("Orange juice");
        product2.setPrice(5.50);
        product2.setQuantity(30);
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
            return new OrderRs(order,true,"Order is correct");
        }else{
            return new OrderRs(order,false,"Order is incorrect");
        }

    }
}
