package cs102.assignment05;

public class Dairy extends Food {
    public Dairy(double taxRate, double kgs, boolean pasteurized, String name) {
        super(taxRate, kgs);
        this.pasteurized = pasteurized;
        this.setName(name);
    }

    private boolean pasteurized;

    public boolean isPasteurized() {
        return this.pasteurized;
    }

    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString() +
                "Pasteurized: " + this.pasteurized + "\n";
    }
}
