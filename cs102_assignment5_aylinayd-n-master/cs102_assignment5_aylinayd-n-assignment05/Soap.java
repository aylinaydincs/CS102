package cs102.assignment05;

public class Soap extends Cleaning {
    private int quantity;

    public Soap(String brand) {
        super(brand);

    }

    public Soap (String brand, int quantity){
        super(brand);
        this.quantity = quantity;

    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String toString() {
        return "Product Name: " + super.getName() + "\n" +
                super.toString() + "\n" +
                "Quantity: " + this.quantity + "\n" ;
    }
    public double calculateTotalPrice(){

        return  super.calculateTotalPrice()* this.quantity;
    }
}
