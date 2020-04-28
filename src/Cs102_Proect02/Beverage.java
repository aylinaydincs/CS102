package Cs102_Proect02;

public class Beverage extends Product {

    private static final double utilityCost =0 ;

    public Beverage(String name, double purchasePrice, double sellingPrice) {
        super(name, purchasePrice, sellingPrice, utilityCost);

    }

    public double calculateExpense() {
       return getPurchasePrice();
    }
}
