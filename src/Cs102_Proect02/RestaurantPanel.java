package Cs102_Proect02;

import javax.swing.*;
import java.awt.*;

public class RestaurantPanel extends JPanel {
    private Restaurant restaurant;
    private JPanel listPanel;
    private JPanel cookPanel;
    private JPanel waiterPanel;
    private JPanel calculateExpensePanel;


    public RestaurantPanel(Restaurant restaurant) {
        this.restaurant = restaurant;
        setLayout(null);

        JButton listEmployees = new JButton("List Employees");
        listEmployees.setBounds(50, 10, 150, 30);
        add(listEmployees);
        JButton addCook = new JButton("Add Cook");
        addCook.setBounds(205, 10, 100, 30);
        add(addCook);
        JButton addWaiter = new JButton("Add Waiter");
        addWaiter.setBounds(310, 10, 100, 30);
        add(addWaiter);
        JButton calculateExpenses = new JButton("Calculate Expenses");
        calculateExpenses.setBounds(415, 10, 150, 30);
        add(calculateExpenses);


        this.listPanel = new JPanel(new GridLayout(1,3));
        listPanel.setBounds(1, 45, 620, 400);
        listPanel.add(new JLabel("ID"));
        listPanel.add(new JLabel("NAME"));
        listPanel.add(new JLabel("JOB"));
        add(listPanel);


        this.waiterPanel = new JPanel(null);
        JLabel waiterName = new JLabel("NAME:");
        this.waiterPanel.setBounds(1, 45, 620, 70);
        waiterName.setBounds(1, 10, 310, 30);
        waiterPanel.add(waiterName);
        JTextField enterName = new JTextField();
        enterName.setBounds(313, 10, 300, 30);
        waiterPanel.add(enterName);
        JButton waiterAdd = new JButton("Add");
        waiterAdd.setBounds(313, 40, 300, 30);
        waiterPanel.add(waiterAdd);
        add(waiterPanel);









    }


}
