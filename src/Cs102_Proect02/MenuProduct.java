package Cs102_Proect02;

import java.util.ArrayList;


public class MenuProduct extends Product {
    private ArrayList<Product> menus;
    public MenuProduct(String name, ArrayList<Product> menus) {
        super(name);
        this.menus = menus;
        setSellingPrice(calculateSellingPrice());
    }
    public double calculateExpense(){
        int expense =0;
        for (int i =0;i<menus.size();i++){
            double n = menus.get(i).getPurchasePrice() + menus.get(i).getUtilityCost();
            expense+=n;
        }
        return expense;

    }
   
}

