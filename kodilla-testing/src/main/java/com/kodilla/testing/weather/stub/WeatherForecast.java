package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemperature(){
        double sum = 0;
        double quantity = temperatures.getTemperatures().size();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum = sum + temperature.getValue();
        }
        double average = sum/quantity;
        return average;
    }
    public double medianTemperature(){
        List<Double> resultList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultList.add(temperature.getValue());
        }
        Collections.sort(resultList);
        double result;
        if (resultList.size()%2 == 0) {
            result = (resultList.get(resultList.size()/2) + resultList.get(resultList.size()/2+1))/2;
        } else {
            result = resultList.get(Math.round(resultList.size()/2));
        }
        return result;
    }
}
