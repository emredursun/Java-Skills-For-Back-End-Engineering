package com.ing.StoreManager;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreManager  {

//    Scenario:
//    You have a soda store and at the end of the day you receive a file containing the sales on that day from the registry.
//    You want to see quantities sold for the whole day and the total amount of income.
//    Task:
//    Write in each method stub the code that lets you accomplish that.
//    Path to the file is: "src/main/java/com/ing/StoreManager/sales.txt"

    private static final String SALES_FILE_PATH = "src/main/java/com/ing/StoreManager/sales.txt";
    private static List<Sales> salesList;

    // Static block to initialize the sales list
    static {
        try {
            salesList = getSalesFromFile();
        } catch (IOException e) {
            e.printStackTrace();
            salesList = List.of(); // Set to an empty list if there's an exception
        }
    }

    public static List<Sales> getSalesFromFile() throws IOException {
        //TO DO - write the code that lets you read from file
        try (Stream<String> lines = Files.lines(Paths.get(SALES_FILE_PATH))) {
            return lines.map(line -> {
                        String[] data = line.split(",");
                        return new Sales(data[0], Integer.parseInt(data[1]), Float.parseFloat(data[2]));
                    })
                    .collect(Collectors.toList());
        }
    }

    public int getTotalQuantityOfSodasSold() throws IOException {
        //TO DO - write the code that sums up the total quantity of products sold
        return salesList.stream()
                .mapToInt(sale -> sale.getQuantity())
                .sum();
    }

    public float getTotalAmountOfMoney() throws IOException {
        //TO DO - write the code that shows how much was earned at the end of the day
        return (float) salesList.stream()
                .mapToDouble(sale -> sale.getPrice() * sale.getQuantity())
                .sum();
    }

}
