package Cs102_Proect02;

public interface Expense {
    public default double calculateExpense() {
        return 0;
    }
}
