package Cs102_Proect02;

public abstract class Employee implements Expense {
    private int id;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee " + getId() + ": " + getName();
    }
}
