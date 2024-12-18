package org.example.model;

import java.io.StringReader;

public class Chocolate extends ProductForSale {
    private String cocoaDetail;

    public Chocolate(String type, int price, String description, String cocoaDetail) {
        super(type, price, description);
        this.cocoaDetail = cocoaDetail;
    }

    public String getCocoaDetail() {
        return cocoaDetail;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details: ");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Details: " + getCocoaDetail());
    }


}
