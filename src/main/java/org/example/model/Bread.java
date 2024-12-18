package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, int price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Bread type: " + getType());
        System.out.println("Bread price: " + getPrice());
        System.out.println("Bread Description: " + getDescription());
        System.out.println("FlourType: " + getFlourType());
    }
}
