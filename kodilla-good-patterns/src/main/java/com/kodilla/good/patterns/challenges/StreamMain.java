package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().values().stream()
                .flatMap(filmList -> filmList.stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);
    }
}
