package com.ing.CollectionsStreams;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsStreams {
    public static Customer customer1 = new Customer(1L, "Stefan Walker", 1);
    public static Customer customer2 = new Customer(2L, "Daija Von", 1);
    public static Customer customer3 = new Customer(3L, "Ariane Rodriguez", 1);
    public static Customer customer4 = new Customer(4L, "Marques Nikolaus", 2);
    public static Customer customer5 = new Customer(5L, "Rachelle Greenfelder", 0);
    public static Customer customer6 = new Customer(6L, "Larissa White", 2);
    public static Customer customer7 = new Customer(7L, "Fae Heidenreich", 1);
    public static Customer customer8 = new Customer(8L, "Dino Will", 2);
    public static Customer customer9 = new Customer(9L, "Eloy Stroman", 1);
    public static Customer customer10 = new Customer(10L, "Brisa O'Connell", 1);

    public static List<Customer> customers = List.of(
            customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10
    );

    public static Product product1 = new Product(1L, "omnis quod consequatur", "Games", 184.83);
    public static Product product2 = new Product(2L, "vel libero suscipit", "Toys", 12.66);
    public static Product product3 = new Product(3L, "non nemo iure", "Grocery", 498.02);
    public static Product product4 = new Product(4L, "voluptatem voluptas aspernatur", "Toys", 536.80);
    public static Product product5 = new Product(5L, "animi cum rem", "Games", 458.20);
    public static Product product6 = new Product(6L, "dolorem porro debitis", "Toys", 146.52);
    public static Product product7 = new Product(7L, "aspernatur rerum qui", "Books", 656.42);
    public static Product product8 = new Product(8L, "deleniti earum et", "Baby", 41.46);
    public static Product product9 = new Product(9L, "voluptas ut quidem", "Books", 697.57);
    public static Product product10 = new Product(10L, "eos sed debitis", "Baby", 366.90);
    public static Product product11 = new Product(11L, "laudantium sit nihil", "Toys", 95.50);
    public static Product product12 = new Product(12L, "ut perferendis corporis", "Grocery", 302.19);
    public static Product product13 = new Product(13L, "sint voluptatem ut", "Toys", 295.37);
    public static Product product14 = new Product(14L, "quos sunt ipsam", "Grocery", 534.64);
    public static Product product15 = new Product(15L, "qui illo error", "Baby", 623.58);
    public static Product product16 = new Product(16L, "aut ex ducimus", "Books", 551.39);
    public static Product product17 = new Product(17L, "accusamus repellendus minus", "Books", 240.58);
    public static Product product18 = new Product(18L, "aut accusamus quia", "Baby", 881.38);
    public static Product product19 = new Product(19L, "doloremque incidunt sed", "Games", 988.49);
    public static Product product20 = new Product(20L, "libero omnis velit", "Baby", 177.61);
    public static Product product21 = new Product(21L, "consectetur cupiditate sunt", "Toys", 95.46);
    public static Product product22 = new Product(22L, "itaque ea qui", "Baby", 677.78);
    public static Product product23 = new Product(23L, "non et nulla", "Grocery", 70.49);
    public static Product product24 = new Product(24L, "veniam consequatur et", "Books", 893.44);
    public static Product product25 = new Product(25L, "magnam adipisci voluptate", "Grocery", 366.13);
    public static Product product26 = new Product(26L, "reiciendis consequuntur placeat", "Toys", 359.27);
    public static Product product27 = new Product(27L, "dolores ipsum sit", "Toys", 786.99);
    public static Product product28 = new Product(28L, "ut hic tempore", "Toys", 316.09);
    public static Product product29 = new Product(29L, "quas quis deserunt", "Toys", 772.78);
    public static Product product30 = new Product(30L, "excepturi nesciunt accusantium", "Toys", 911.46);

    public static List<Product> products = List.of(product1, product2, product3, product4, product5, product6,
            product7, product8, product9, product10, product11, product12, product13, product14, product15,
            product16, product17, product18, product19, product20, product21, product22, product23, product24,
            product25, product26, product27, product28, product29, product30);

    public static List<Order> orders = List.of(
            new Order(1L, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "NEW", customer4, Set.of(product5, product19, product21)),
            new Order(2L, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "NEW", customer3, Set.of(product11, product13, product14, product17)),
            new Order(3L, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED", customer5, Set.of(product5, product3, product19, product13, product15)),
            new Order(4L, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING", customer3, Set.of(product12, product22, product26)),
            new Order(5L, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "NEW", customer1, Set.of(product5)),
            new Order(6L, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED", customer9, Set.of(product5, product12)),
            new Order(7L, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING", customer8, Set.of(product8, product25, product21, product1, product13, product10)),
            new Order(8L, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "NEW", customer4, Set.of(product8, product12)),
            new Order(9L, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "NEW", customer10, Set.of(product8)),
            new Order(10L, LocalDate.parse("2021-03-10"), LocalDate.parse("2021-03-19"), "NEW", customer8, Set.of(product14, product8)),
            new Order(11L, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED", customer1, Set.of(product21, product22, product12, product6, product27, product11)),
            new Order(12L, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING", customer5, Set.of(product19, product13, product11, product6)),
            new Order(13L, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "NEW", customer5, Set.of(product11, product24, product26, product23)),
            new Order(14L, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING", customer4, Set.of(product18)),
            new Order(15L, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED", customer5, Set.of(product16, product13, product7)),
            new Order(16L, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "NEW", customer1, Set.of(product23, product29, product18, product16, product22, product26)),
            new Order(17L, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED", customer6, Set.of(product18, product4)),
            new Order(18L, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING", customer9, Set.of(product13, product3, product27, product2)),
            new Order(19L, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED", customer9, Set.of(product26, product22, product18, product14, product15, product13)),
            new Order(20L, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "NEW", customer5, Set.of(product22)),
            new Order(21L, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED", customer9, Set.of(product21, product26)),
            new Order(22L, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "NEW", customer5, Set.of(product7, product6)),
            new Order(23L, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING", customer4, Set.of(product27, product7, product11, product5)),
            new Order(24L, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED", customer1, Set.of(product24, product2, product6, product28, product4)),
            new Order(25L, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "NEW", customer1, Set.of(product28, product17, product2, product29, product19)),
            new Order(26L, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "NEW", customer10, Set.of(product4)),
            new Order(27L, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "NEW", customer1, Set.of(product6, product15, product24)),
            new Order(28L, LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED", customer2, Set.of(product22, product9)),
            new Order(29L, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING", customer1, Set.of(product22)),
            new Order(30L, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED", customer1, Set.of(product29, product6, product8)),
            new Order(31L, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "NEW", customer3, Set.of(product16, product12, product28)),
            new Order(32L, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED", customer2, Set.of(product8, product5)),
            new Order(33L, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING", customer1, Set.of(product12, product26, product21, product23, product28, product13)),
            new Order(34L, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "NEW", customer6, Set.of(product1, product6, product22, product19, product13, product27)),
            new Order(35L, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "NEW", customer1, Set.of(product5, product11, product26, product9)),
            new Order(36L, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED", customer2, Set.of(product28, product7)),
            new Order(37L, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "NEW", customer8, Set.of(product15, product11)),
            new Order(38L, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "NEW", customer8, Set.of(product18, product11, product14, product20, product7)),
            new Order(39L, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "NEW", customer9, Set.of(product1, product21)),
            new Order(40L, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING", customer3, Set.of(product12, product10, product11, product29, product1)),
            new Order(41L, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "NEW", customer5, Set.of(product13, product19, product5, product29, product14, product4)),
            new Order(42L, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED", customer9, Set.of(product2)),
            new Order(43L, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "NEW", customer3, Set.of(product6)),
            new Order(44L, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED", customer4, Set.of(product20, product18, product8, product24, product26, product13)),
            new Order(45L, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED", customer1, Set.of(product23, product1, product25, product15)),
            new Order(46L, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "NEW", customer10, Set.of(product16, product24, product19, product13, product11)),
            new Order(47L, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING", customer2, Set.of(product23, product28, product20, product21)),
            new Order(48L, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "NEW", customer2, Set.of(product15, product3, product26, product7, product19, product10)),
            new Order(49L, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "NEW", customer7, Set.of(product5, product13, product29, product3, product12, product17)),
            new Order(50L, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "NEW", customer9, Set.of(product15, product16))
    );

    // Exercise 1
    // Obtain a list of products belongs to category “Books” with price > 100
    public static List<Product> filterBooksWithPriceAbove100() {
        return products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }

    // Exercise 2
    // Obtain a list of order with products belong to category “Baby”
    public static List<Order> filterOrdersWithProductsForBaby() {
        return orders
                .stream()
                .filter(o ->
                        o.getProducts()
                                .stream()
                                .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
                )
                .collect(Collectors.toList());
    }

    // Exercise 3
    // Obtain a list of product with category = “Toys” and then apply 10% discount
    public static List<Product> applyDiscountForToysProducts() {
        return products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .peek(p -> p.setPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    // Exercise 4
    // Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
    // Sort the list by Order id
    public static List<Product> filterProductsOfTier2AndDateInterval() {
        return orders.stream()
                .filter(o -> o.getCustomer().getTier() == 2)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .sorted(Comparator.comparing(Product::getId))
                .collect(Collectors.toList());
    }

    //Exercise 5
    // Get the cheapest products of “Books” category
    public static Optional<Product> getCheapestBook() {
        return products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(Product::getPrice));
    }

    // Exercise 6
    // Get the 3 most recent placed order
    public static List<Order> getThreeMostRecentOrders() {
        return orders
                .stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // Exercise 7
    // Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
    // Sort the list by product id
    public static List<Product> getProductsFrom15March() {
        return orders
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                .peek(o -> System.out.println(o.toString()))
                .flatMap(o -> o.getProducts().stream())
                .sorted(Comparator.comparing(Product::getId))
                .distinct()
                .collect(Collectors.toList());
    }

    // Exercise 8
    // Calculate total lump sum of all orders placed in Feb 2021
    public static Double calculateTotalSumOfOrdersinFeb() {
        return orders
                .stream()
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    // Exercise 9
    // Calculate order average payment placed on 14-Mar-2021
    public static Double calculateAveragePaymentOn14March() {
        return orders
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average().getAsDouble();
    }

    // Exercise 10
    // Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
    public static DoubleSummaryStatistics statistics() {
        return products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
    }

    // Exercise 11
    //  Obtain a data map with list of product name by category
    public static Map<String, List<String>> getProductNamesByCategory() {
        return products
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(Product::getName, Collectors.toList()))
                );
    }

    // Exercise 12
    // Get the most expensive product by category
    public static Map<String, Optional<Product>> getMostExpensiveProductByCategory() {
        return products
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.maxBy(Comparator.comparing(Product::getPrice))));
    }
}