package Cs102_Proect02;

public class Cook extends Employee {
    private double salary;
    private double taxRate;

    public Cook(String name, double salary) {
        super(name);
        this.salary = salary;
        this.taxRate = 0.18;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxRate() {
        return taxRate;
    }


    public double calculateExpense() {
        return this.getSalary()*(1+this.getTaxRate());
    }
}
