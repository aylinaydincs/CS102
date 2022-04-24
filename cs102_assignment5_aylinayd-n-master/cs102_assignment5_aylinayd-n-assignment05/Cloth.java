package cs102.assignment05;

public class Cloth extends Product {
    private String brand;
    private String color;
    private int quantity;

    public Cloth(double taxRate, String color, String brand) {
        super(taxRate);
        this.color = color;
        this.brand = brand;
        setType("cloth");
       
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return super.toString() +
                "Brand: " + this.brand + "\n" +
                "Color: " + this.color + "\n" +
                "Quantity: " + this.quantity + "\n";
    }

    public double calculateTotalPrice(){

        return  super.calculateTotalPrice()* this.quantity;
    }


}
