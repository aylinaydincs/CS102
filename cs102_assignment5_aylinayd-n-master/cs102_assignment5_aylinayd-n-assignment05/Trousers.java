package cs102.assignment05;

public class Trousers extends Cloth {
    public Trousers(double taxRate, String color, String brand) {
        super(taxRate, color, brand);
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString();
    }
}
