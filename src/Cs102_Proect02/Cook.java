package Cs102_Proect02;

public class Cook extends Employee {
    private double salary;
    private double taxRate;

    public Cook(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
