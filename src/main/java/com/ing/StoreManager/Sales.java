package com.ing.StoreManager;

//DO NOT DELETE - this is a support class for the exercise
public class Sales {
    private final String productName;
    private final int quantity;
    private final float price;

    public Sales(String productName, int quantity, float price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
}
