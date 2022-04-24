package Cs102_Assignment06;

public class Blackberry extends Fruit implements GroundFruit{
    public Blackberry() {
        super("black");
        this.getVitamin();

    }

    @Override
    public String getVitamin() {
        return ("C , K");
    }

    public void pick (){
        System.out.println("Picking a blackberry.");
    }
    public String toString() {
        return "Blackberries are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }
    public void pick (){
        System.out.println("Picking a blackberry.");
    }
    public String toString() {
        return "Blackberries are " + this.getColor() +" and they  have " + this.getVitamin() + "vitamins.";
    }

}
