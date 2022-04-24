package cs102.assignment05;

public class Food extends Product {
    private double kgs;
    private String expirationDate;




    public Food(double taxRate, double kgs) {
        super(taxRate);
        this.kgs = kgs;
        this.expirationDate = "2020-11-13";
        setType("food");

    }

    public Food(String name) {
        super();
        this.expirationDate = "2020-11-13";
        this.setName(name);
        setType("food");

    }

    public double getKgs() {
        return this.kgs;
    }

    public void setKgs(double kgs) {
        this.kgs = kgs;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString() {
        return super.toString() +
                "Weight: " + this.kgs + "\n" +
                "Expiration date: " + this.expirationDate + "\n";
    }
    public double calculateTotalPrice(){

        return  super.calculateTotalPrice()* this.kgs;
    }

}
