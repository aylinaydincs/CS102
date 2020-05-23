package Cs102_Proect02;

import javax.swing.*;
import java.awt.*;

public class RestaurantPanel extends JPanel {
    private Restaurant restaurant;
    protected JButton listEmployees ;
    protected JButton addCook;
    protected JButton addWaiter;
    protected JButton calculateExpenses;

    public RestaurantPanel(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.setLayout(new FlowLayout());
        this.listEmployees = new JButton("List Employees");
        this.addCook = new JButton("Add Cook");
        this.addWaiter = new JButton("Add Waiter");
        this.calculateExpenses = new JButton("Calculate Expenses");

    }
}
