package Cs102_Assignment06;


public class Apple extends Fruit implements TreeFruit{
    public Apple() {
        super("green");
        this.getVitamin();
    }

    @Override
    public String getVitamin() {
        return ("A , B12");
    }
    public void peel (){
        System.out.println("Peeling an apple.");
    }

    @Override
    public String toString() {
        return "Apples are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }
}
