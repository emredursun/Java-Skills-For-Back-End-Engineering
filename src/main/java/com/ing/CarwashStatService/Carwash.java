package com.ing.CarwashStatService;

// DO NOT MODIFY!!!
public class Carwash {
    private String carModel;
    private int year;
    private String customerName;
    private double amountPaid;
    private String carColor;

    public Carwash(String carModel, int year, String customerName, double amountPaid, String carColor) {
        this.carModel = carModel;
        this.year = year;
        this.customerName = customerName;
        this.amountPaid = amountPaid;
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}

