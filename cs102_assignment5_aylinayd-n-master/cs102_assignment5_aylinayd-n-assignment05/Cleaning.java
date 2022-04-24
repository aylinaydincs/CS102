package cs102.assignment05;

public class Cleaning extends Product {
    private String brand;


    public Cleaning(String brand) {

        this.brand = brand;
        setType("cleaning");


    }

    public String getBrand() {

        return this.brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String toString() {
        return super.toString() +
                "Brand: " + this.brand + "\n";
    }



}
