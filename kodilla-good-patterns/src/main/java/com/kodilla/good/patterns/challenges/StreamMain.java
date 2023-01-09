package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().values().stream()
                .flatMap(filmList -> filmList.stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);

        User user = new User();
        user.setLastName("Bania");
        user.setName("Hania");
        Product book = new Product();
        book.setName("Coma");
        book.setPrice(29.99);
        book.setSeller("Ksiegarnia");
        OrderRequest firstOrder = new OrderRequest();
        firstOrder.setBuyer(user);
        firstOrder.setProduct(book);
        ProductOrderService productOrderService = new ProductOrderService ( new MailInformationService(), new SellServiceImpl(), new SellRepositoryImpl());
        productOrderService.process(firstOrder);
    }
}
