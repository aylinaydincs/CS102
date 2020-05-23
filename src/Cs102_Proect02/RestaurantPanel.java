package Cs102_Proect02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.DataFormatException;

public class RestaurantPanel extends JPanel {
    private Restaurant restaurant;
    private JPanel listPanel;
    private JPanel cookPanel;
    private JPanel waiterPanel;
    private JPanel calculateExpensePanel;

    private JButton listEmployees;
    private JButton addCook;
    private JButton addWaiter;
    private JButton calculateExpenses;


    public RestaurantPanel(Restaurant restaurant) {
        this.restaurant = restaurant;
        setLayout(null);

        this.listEmployees = new JButton("List Employees");
        listEmployees.setBounds(50, 10, 150, 30);
        add(listEmployees);

        this.addCook = new JButton("Add Cook");
        addCook.setBounds(205, 10, 100, 30);
        add(addCook);

        this.addWaiter = new JButton("Add Waiter");
        addWaiter.setBounds(310, 10, 100, 30);
        add(addWaiter);
        this.calculateExpenses = new JButton("Calculate Expenses");
        calculateExpenses.setBounds(415, 10, 150, 30);
        add(calculateExpenses);


        this.listPanel = new JPanel(new GridLayout(1,3));
        listPanel.setBounds(1, 45, 620, 400);
        listPanel.add(new JLabel("ID"));
        listPanel.add(new JLabel("NAME"));
        listPanel.add(new JLabel("JOB"));
        add(listPanel);


        this.cookPanel = new JPanel(null);
        this.cookPanel.setBounds(1, 45, 620, 200);
        JLabel cookName = new JLabel("Name:");
        cookName.setBounds(1, 10, 310, 24);
        cookPanel.add(cookName);
        JTextField enterCookName = new JTextField();
        enterCookName.setBounds(312, 10, 300, 24);
        cookPanel.add(enterCookName);
        JLabel salary = new JLabel("Salary:");
        salary.setBounds(1, 36, 310, 24);
        cookPanel.add(salary);
        JTextField enterSalary = new JTextField();
        enterSalary.setBounds(312, 36, 300, 24);
        cookPanel.add(enterSalary);
        JButton addingCook = new JButton("Add");
        addingCook.setBounds(312, 70, 300, 30);
        cookPanel.add(addingCook);
        add(cookPanel);


        this.waiterPanel = new JPanel(null);
        this.waiterPanel.setBounds(1, 45, 620, 70);
        JLabel waiterName = new JLabel("NAME:");
        waiterName.setBounds(1, 10, 310, 30);
        waiterPanel.add(waiterName);
        JTextField enterWaiterName = new JTextField();
        enterWaiterName.setBounds(313, 10, 300, 24);
        waiterPanel.add(enterWaiterName);
        JButton waiterAdd = new JButton("Add");
        waiterAdd.setBounds(313, 38, 300, 24);
        waiterPanel.add(waiterAdd);
        add(waiterPanel);



        this.calculateExpensePanel = new JPanel(null);
        this.calculateExpensePanel.setBounds(1, 45, 620, 200);
        JLabel expenses = new JLabel("Expenses:");
        expenses.setBounds(1, 10, 310, 30);
        calculateExpensePanel.add(expenses);
        JLabel expensesDisplay = new JLabel("0.0 TL");
        expensesDisplay.setBounds(312, 10, 300, 24);
        calculateExpensePanel.add(expensesDisplay);
        JLabel revenue = new JLabel("Revenue:");
        revenue.setBounds(1, 36, 310, 24);
        calculateExpensePanel.add(revenue);
        JLabel revenueDisplay = new JLabel("0.0 TL");
        revenueDisplay.setBounds(312, 36, 300, 24);
        calculateExpensePanel.add(revenueDisplay);
        JLabel profit = new JLabel("Profit:");
        profit.setBounds(1, 66, 300, 24);
        calculateExpensePanel.add(profit);
        JLabel profitDisplay = new JLabel("0.0 TL");
        profitDisplay.setBounds(312, 66, 300, 24);
        calculateExpensePanel.add(profitDisplay);
        add(calculateExpensePanel);

        this.listEmployees.addActionListener(new EmployeeListener());
        this.addCook.addActionListener(new CookListener(enterCookName,enterSalary));
        this.addWaiter.addActionListener(new WaiterListener(enterWaiterName));
        

        this.listPanel.setVisible(false);
        this.cookPanel.setVisible(false);
        this.waiterPanel.setVisible(false);
        this.calculateExpensePanel.setVisible(false);


    }

    class EmployeeListener implements ActionListener{
        public EmployeeListener() {
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton ){
                listPanel.setVisible(true);
                cookPanel.setVisible(false);
                waiterPanel.setVisible(false);
                calculateExpensePanel.setVisible(false);

            }

        }
    }
    class CookListener implements ActionListener{
        private JTextField name;
        private JTextField salary;
        public CookListener(JTextField name , JTextField salary) {
            this.name = name;
            this.salary = salary;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() instanceof JButton){
               try {
                   cookPanel.setVisible(true);
                   String cookName = this.name.getText();
                   Double cookSalary = Double.parseDouble(this.salary.getText());
                   restaurant.addCook(cookName, cookSalary);
                   this.name.setText(null);
                   this.salary.setText(null);
                   JOptionPane.showMessageDialog(null, "Cook added successfully");
                   cookPanel.setVisible(false);
               } catch (Exception e){
                   JOptionPane.showMessageDialog(null,"Please, give proper salary");
                   actionPerformed(actionEvent);
               }
            }
        }
    }
    class WaiterListener implements ActionListener{
        private JTextField name;
        public WaiterListener(JTextField name) {
            this.name = name;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton){
                waiterPanel.setVisible(true);
                String waiterName = this.name.getText();
                restaurant.addWaiter(waiterName);
                this.name.setText(null);
                JOptionPane.showMessageDialog(null, "Waiter added successfully");
                waiterPanel.setVisible(false);

            }
        }
    }


}
