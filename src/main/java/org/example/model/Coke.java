package org.example.model;

public class Coke extends ProductForSale{
    private String flavour;

    public Coke(String type, int price, String description, String flavour) {
        super(type, price, description);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Coke Flavour: " + getFlavour());
    }
}
