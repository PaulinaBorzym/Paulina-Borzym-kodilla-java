package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer>exterminate(List<Integer> numbers) {

        List<Integer> evenList = new ArrayList<>();

        for (int n=0; n<numbers.size(); n++) {
            if (numbers.get(n) % 2 == 0) {
                evenList.add(numbers.get(n));
            }
        }
        return evenList;
    }
}
