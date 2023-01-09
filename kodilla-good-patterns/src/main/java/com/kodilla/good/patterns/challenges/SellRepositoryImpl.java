package com.kodilla.good.patterns.challenges;

public class SellRepositoryImpl implements SellRepository{

    @Override
    public void saveData(Product product, User user) {
        System.out.println(user.getName()+ " " + user.getLastName()+ " buys " + product.getName() + " for " + product.getPrice());
    }
}
