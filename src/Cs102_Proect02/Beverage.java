package Cs102_Proect02;

public class Beverage extends Product {

    private static final double utilityCost =0 ;

    public Beverage(String name, double sellingPrice, double purchasePrice) {
        super(name, sellingPrice, purchasePrice, utilityCost);
    }

    public double calculateExpense() {
       return getPurchasePrice();
    }
}
