package com.ing.CarwashStatService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

// DO NOT MODIFY!!!
public class CarwashDataService {

    private List<Carwash> carwashes;

    public CarwashDataService() {
        carwashes = new ArrayList<>();
        carwashes.add(new Carwash("Toyota Camry", 2019, "John", 25.0, "Red"));
        carwashes.add(new Carwash("Honda Civic", 2020, "Jane", 30.0, "Blue"));
        carwashes.add(new Carwash("Ford Mustang", 2018, "Bob", 40.0, "Black"));
        carwashes.add(new Carwash("Tesla Model S", 2021, "Alice", 50.0, "White"));
        carwashes.add(new Carwash("Nissan Altima", 2017, "David", 20.0, "Silver"));
        carwashes.add(new Carwash("Chevrolet Impala", 2016, "Emily", 35.0, "Gray"));
        carwashes.add(new Carwash("Jeep Wrangler", 2015, "Michael", 45.0, "Green"));
        carwashes.add(new Carwash("BMW 3 Series", 2014, "Linda", 55.0, "Black"));
        carwashes.add(new Carwash("Audi A4", 2013, "Chris", 30.0, "Blue"));
        carwashes.add(new Carwash("Mercedes-Benz C-Class", 2012, "Olivia", 40.0, "Red"));
        carwashes.add(new Carwash("Volkswagen Jetta", 2011, "Andrew", 25.0, "White"));
        carwashes.add(new Carwash("Subaru Outback", 2010, "Sophia", 35.0, "Silver"));
        carwashes.add(new Carwash("Mazda CX-5", 2009, "Daniel", 45.0, "Black"));
        carwashes.add(new Carwash("Lexus ES", 2008, "Isabella", 50.0, "Blue"));
        carwashes.add(new Carwash("Infiniti G35", 2007, "William", 30.0, "Green"));
        carwashes.add(new Carwash("Hyundai Elantra", 2006, "Mia", 20.0, "Red"));
        carwashes.add(new Carwash("Kia Optima", 2005, "Ethan", 35.0, "White"));
        carwashes.add(new Carwash("Toyota Corolla", 2004, "Ava", 25.0, "Gray"));
        carwashes.add(new Carwash("Honda Accord", 2003, "Noah", 30.0, "Black"));
        carwashes.add(new Carwash("Ford Taurus", 2002, "Emma", 40.0, "Silver"));
    }

    public CompletableFuture<List<Carwash>> getCarwashes() {
        CompletableFuture<List<Carwash>> future = new CompletableFuture<>();
        future.complete(carwashes);
        return future;
    }
}
