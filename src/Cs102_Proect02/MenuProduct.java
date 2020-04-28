package Cs102_Proect02;

import java.util.ArrayList;


public class MenuProduct extends Product {
    private ArrayList<Product> products;
    public MenuProduct(String name, ArrayList<Product> products) {
        super(name);
        this.products =products;

    }
    public double calculateExpense(){
        int expense =0;
        for (int i =0;i<products.size();i++){
            double n = products.get(i).getPurchasePrice() + products.get(i).getUtilityCost();
            expense+=n;
        }
        return expense;

    }
    protected double calculateSellingPrice(){
        double price =0;
        for (int i =0;i<products.size();i++){
            if (products.get(i) instanceof MainDish){
                price += products.get(i).getSellingPrice()*0.9;
            }
            if (products.get(i) instanceof Dessert){
                price += products.get(i).getSellingPrice()*0.8;
            }
            if (products.get(i) instanceof Beverage){
                price += products.get(i).getSellingPrice()*0.5;
            }
        }
        return price;
    }
}

