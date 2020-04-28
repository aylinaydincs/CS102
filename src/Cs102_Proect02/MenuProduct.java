package Cs102_Proect02;

import java.awt.*;
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
}

