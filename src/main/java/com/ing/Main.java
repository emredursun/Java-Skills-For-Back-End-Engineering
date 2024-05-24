package com.ing;

import com.ing.CollectionsStreams.Product;
import com.ing.StoreManager.StoreManager;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        StoreManager storeManager = new StoreManager();
        int totalQuantityOfSodasSold = storeManager.getTotalQuantityOfSodasSold();
        float totalAmountOfMoney = storeManager.getTotalAmountOfMoney();
        System.out.println("Total Quantity Of Sodas Sold: " + totalQuantityOfSodasSold);
        System.out.println("Total Amount Of Money: " + totalAmountOfMoney);

    }
}