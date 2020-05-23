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
        add(listEmployees);
        listEmployees.addActionListener(new RestaurantPanelListener());
        this.addCook = new JButton("Add Cook");
        add(addCook);
        addCook.addActionListener(new RestaurantPanelListener());
        this.addWaiter = new JButton("Add Waiter");
        add(addWaiter);
        addWaiter.addActionListener(new RestaurantPanelListener());
        this.calculateExpenses = new JButton("Calculate Expenses");
        add(calculateExpenses);
        calculateExpenses.addActionListener(new RestaurantPanelListener());
        

    }


}
