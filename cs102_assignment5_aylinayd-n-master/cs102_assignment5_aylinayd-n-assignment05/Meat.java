package cs102.assignment05;

public class Meat extends Food {
    private String quality;

    public Meat(double taxRate, double kgs, String quality) {
        super(taxRate, kgs);
        this.quality = quality;
    }

    public String getQuality() {
        return this.quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString() + "\n" +
                "Quality: " + this.quality + "\n";
    }
}
