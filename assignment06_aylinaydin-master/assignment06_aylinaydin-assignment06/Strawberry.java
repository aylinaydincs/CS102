package Cs102_Assignment06;

public class Strawberry extends Fruit implements GroundFruit {
    public Strawberry() {
        super("red");
        this.getVitamin();
    }

    @Override
    public String getVitamin() {
        return ("B5 , E");
    }
    public void pick (){
        System.out.println("Picking a strawberry.");
    }
    public String toString() {
        return "Strawberries are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }
}
