package org.example.model;

import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Chocolate",10,"Milk Chocolate", "50%"),
                new Bread("Regular",5,"Whole White Bread","normal"),
                new Coke("Coke",10,"Drink Cold","Zero")
        };

        Store store = new Store();
        store.listProducts(products);


        Troll troll = new Troll("Aggressive Troll",100,20.0);
        System.out.println("Monster: " + troll.getName());
        System.out.println("Hit Points: " + troll.getHitPoint());
        System.out.println("Base Damage: " + troll.getDamage());
        System.out.println("Bleed Damage: " + troll.bleed());
        System.out.println("Poison Damage: " + troll.poison());
        System.out.println("Total Attack Damage: " + troll.attack());
    }

    public static void listProducts(ProductForSale[] products) {
       for (ProductForSale product: products){
           product.showDetails();
           System.out.println("----------------------------");
       }
    }
}