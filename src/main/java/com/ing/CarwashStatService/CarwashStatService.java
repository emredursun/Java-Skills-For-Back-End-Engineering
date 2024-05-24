package com.ing.CarwashStatService;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;


//Coding Exercise - Hands-on assessment
// Your friend, who owns a car wash business, has asked for your help to implement a couple of functions to automate his business. As a good friend, you agree to do so.
//Your task is to implement two functions, getAverageAmountPaid and getMostCommonCarColor, in the CarwashStatService class. You can obtain the list of Carwash objects from the carwashDataService private field's getCarwashes function.
//Note: Do not modify the code, except for the implementation of the two functions.

public class CarwashStatService {

    private final CarwashDataService carwashDataService;

    public CarwashStatService() {
        carwashDataService = new CarwashDataService();
    }

    // This function calculates and returns the average amount paid by customers for car wash services.
    public CompletableFuture<Double> getAverageAmountPaid() {
        // Implement the function here
        return carwashDataService.getCarwashes().thenApply(carwashes ->
                carwashes.stream().mapToDouble(Carwash::getAmountPaid).average().orElse(0.0)
        );
    }

    // This function determines the most common car color among all the cars that were washed.
    public String getMostCommonCarColor() throws ExecutionException, InterruptedException {
        // Implement the function here
        List<Carwash> carwashes = carwashDataService.getCarwashes().get();

        Map<String, Long> colorFrequency = carwashes.stream()
                .collect(Collectors.groupingBy(Carwash::getCarColor, Collectors.counting()));

        return Collections.max(colorFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

