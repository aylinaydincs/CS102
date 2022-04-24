package cs102.week05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Skirt(5, "M&S", "red", 20, "skirt"));
        products.get(0).setPrice(40);

        Vegetable pepper = new Vegetable(18, 0.5, false, "pepper");
        pepper.setKgs(10);
        products.add(pepper);

        DishWashing tablet = new DishWashing("C");
        tablet.setLts(30);
        tablet.setPrice(25);
        tablet.setLiquid(false);
        tablet.setName("tablet");
        products.add(tablet);

        Trousers jean = new Trousers(30, "blue", "B");
        jean.setName("jean");
        jean.setPrice(50.99);
        jean.setQuantity(10);
        products.add(jean);

        Dairy milk = new Dairy(25, 1, true, "milk");
        milk.setExpirationDate("2020-03-27");
        milk.setPrice(2.95);
        products.add(milk);

        double total = 0;

        // Fill out the rest
    }
}

