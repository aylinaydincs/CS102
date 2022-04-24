package cs102.assignment05;

public class Product {
    private double taxRate;
    private double price;
    private String name;
    private String type; /*It's represent the type of product that we can implement in the extends' classes' constructor
                        so that when we're try to write plug it's very easy for us*/
    public Product() {
        this.taxRate = 18;
        this.price = 1;

    }

    public Product(double taxRate) {
        this.taxRate = taxRate;


    }


    public Product(double taxRate, double price) {
        this.taxRate = taxRate;
        this.price = price;

    }

    public double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Tax rate: " + this.taxRate + "\n" +
                "Price: " + this.price + "\n";
    }

    public double calculateTotalPrice(){

        return  (this.getPrice()*(getTaxRate()/100 + 1));

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
