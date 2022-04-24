package cs102.assignment05;

public class Detergent extends Cleaning {
    private double lts;
    private boolean liquid;

    public Detergent(String brand) {

        super(brand);
    }

    public Detergent(String brand, double lts, boolean liquid) {
        super(brand);
        this.lts = lts;
        this.liquid = liquid;
    }

    public double getLts() {
        return this.lts;
    }

    public void setLts(double lts) {
        this.lts = lts;
    }

    public boolean isLiquid() {
        return this.liquid;
    }

    public void setLiquid(boolean liquid) {
        this.liquid = liquid;
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString() +
                "Volume: " + this.lts + "\n" +
                "Liquid: " + this.liquid + "\n";
    }
    public double calculateTotalPrice(){

        return  super.calculateTotalPrice()* this.lts;
    }
}
