package cs102.assignment05;

public class Vegetable extends Food {
    private boolean organic;

    public Vegetable(double taxRate, double kgs, boolean organic, String name) {
        super(taxRate, kgs);
        this.organic = organic;
        this.setName(name);
        this.setPrice(1.0);
    }

    public boolean isOrganic() {
        return this.organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString() +
                "Organic: " + this.organic + "\n";
    }
}
