package Cs102_Assignment06;

public abstract class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    public abstract String getVitamin();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String toString();
}
