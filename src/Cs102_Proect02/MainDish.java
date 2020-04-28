package Cs102_Proect02;

public class MainDish extends Product {

    public MainDish(String name, double purchasePrice, double sellingPrice, double utilityCost) {
        super(name, purchasePrice, sellingPrice, utilityCost);
    }

    public double calculateExpense() {
        return getPurchasePrice() + getUtilityCost();
    }
}
