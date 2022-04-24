package Cs102_Assignment06;

public class Banana extends Fruit implements TreeFruit {
    public Banana() {
        super("yellow");
        this.getVitamin();
    }

    @Override
    public String getVitamin() {
        return ("C , D");
    }
    public void peel (){
        System.out.println("Peeling a banana.");
    }
    public String toString() {
        return "Bananas are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }
    public void peel (){
        System.out.println("Peeling a banana.");
    }
    public String toString() {
        return "Bananas are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }

}
