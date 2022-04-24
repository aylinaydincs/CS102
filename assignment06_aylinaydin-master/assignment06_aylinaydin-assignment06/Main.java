package Cs102_Assignment06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Apple());
        fruits.add(new Banana());
        fruits.add(new Strawberry());
        fruits.add(new Blackberry());
        prepareFruits(fruits);
    }
    public static void prepareFruits (ArrayList<Fruit> fruits) {
        for (int i=0;i<fruits.size();i++){
            if(fruits.get(i) instanceof TreeFruit){
                ((TreeFruit) fruits.get(i)).peel();
            }
            else if (fruits.get(i) instanceof GroundFruit){
                ((GroundFruit) fruits.get(i)).pick();
            }
        }

    }
}
