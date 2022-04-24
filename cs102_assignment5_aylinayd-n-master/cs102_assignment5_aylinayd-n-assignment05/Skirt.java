package cs102.assignment05;

public class Skirt extends Cloth {
    public Skirt(int quantity, String brand, String color, double taxRate, String name) {
        super(taxRate, color, brand);
        this.setQuantity(quantity);
        this.setName(name);
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString();
    }
}
