package Cs102_Proect02;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderPanel extends JPanel {
    private Restaurant restaurant;
    private  JPanel mainPanel;
    private  JPanel productAddPanel;
    private  JPanel currentOrder;
    private  JPanel finalPanel;
    private Order order = new Order();
    private Waiter waiter;

    public OrderPanel(Restaurant restaurant) {
        this.restaurant = restaurant;

        this.mainPanel = new JPanel();
        JButton newOrder =new JButton("New Order");
        this.mainPanel.add(newOrder);
        add(mainPanel);

        this.productAddPanel = new JPanel(new GridLayout(4,2));
        Border productBorder = BorderFactory.createTitledBorder("Add Product");
        this.productAddPanel.setBorder(productBorder);

        JLabel product = new JLabel("Product:");
        product.setPreferredSize(new Dimension(300, 35));
        JComboBox selectProduct = new JComboBox();
        addingProduct(selectProduct);
        selectProduct.setPreferredSize(new Dimension(300, 35));
        this.productAddPanel.add(product);
        this.productAddPanel.add(selectProduct);

        JLabel count = new JLabel("Count:");
        count.setPreferredSize(new Dimension(300, 35));
        SpinnerNumberModel numberModel = new SpinnerNumberModel(1,1,10000,1);
        JSpinner spinner = new JSpinner(numberModel);
        spinner.setPreferredSize(new Dimension(300, 35));
        this.productAddPanel.add(count);
        this.productAddPanel.add(spinner);

        JLabel price = new JLabel("Price:");
        JLabel priceDisplay = new JLabel("0,00 TL");
        this.productAddPanel.add(price);
        this.productAddPanel.add(priceDisplay);

        JButton addButton = new JButton("Add");
        this.productAddPanel.add(addButton);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Product Name");
        model.addColumn("Count");
        model.addColumn("Price");


        this.currentOrder = new JPanel();
        Border orderBorder = BorderFactory.createTitledBorder("Current Order");
        currentOrder.setBorder(orderBorder);

        JTable orderTable = new JTable(model);
        this.currentOrder.add(orderTable);
        orderTable.setPreferredScrollableViewportSize(new Dimension(600, 200));
        this.currentOrder.add(new JScrollPane(orderTable));


        this.finalPanel = new JPanel();
        JButton finalize = new JButton("Finalize");
        this.finalPanel.add(finalize);

        add(productAddPanel);
        add(currentOrder);
        add(finalPanel);

        newOrder.addActionListener(new orderListener());
        selectProduct.addActionListener(new productListener(priceDisplay,selectProduct));
        addButton.addActionListener(new addingListener(model,spinner,selectProduct));
        finalize.addActionListener(new finalizeListener(model,spinner,selectProduct));


        this.productAddPanel.setVisible(false);
        this.currentOrder.setVisible(false);
        this.finalPanel.setVisible(false);

    }
    private void addingProduct(JComboBox comboBox){
        for(int i=0;i<restaurant.getProducts().size();++i){
            comboBox.addItem(restaurant.getProducts().get(i));
        }
    }
    private void setVisibility(){
        this.productAddPanel.setVisible(true);
        this.currentOrder.setVisible(true);
        this.finalPanel.setVisible(true);
    }
    private class orderListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton){
                mainPanel.setVisible(false);
                setVisibility();
                restaurant.assignWaiter();
                waiter = restaurant.assignWaiter();
                JOptionPane.showMessageDialog(null,"Hi, I am " + restaurant.assignWaiter().getName() +
                        ".\nI will be our waiter today.\nWhat would you like to get today?");

            }
        }
    }
    private class productListener implements ActionListener{
        private JLabel price;
        private JComboBox productBox;
        public productListener(JLabel price,JComboBox productBox){
            this.price =price;
            this.productBox = productBox;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JComboBox){
              Product product = (Product) productBox.getSelectedItem();
              price.setText(Double.toString(product.getSellingPrice()));

            }

        }
    }
    private class addingListener implements ActionListener{
        private DefaultTableModel tableModel;
        private JSpinner spinner;
        private JComboBox productBox;

        public addingListener(DefaultTableModel tableModel, JSpinner spinner, JComboBox productBox) {
            this.tableModel = tableModel;
            this.spinner = spinner;
            this.productBox = productBox;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton){
                Product product = (Product) productBox.getSelectedItem();
                double price = product.getSellingPrice();
                int count = (Integer) spinner.getValue();
                tableModel.addRow(new Object[]{product.getName(), Integer.toString(count), Double.toString(price * count)});
                for(int i=0;i<count;++i){
                    order.addProduct(product);
                }
            }
        }
    }
    private class finalizeListener implements ActionListener{
        private DefaultTableModel tableModel;
        private JSpinner spinner;
        private JComboBox comboBox;

        public finalizeListener(DefaultTableModel tableModel, JSpinner spinner, JComboBox comboBox) {
            this.tableModel = tableModel;
            this.spinner = spinner;
            this.comboBox = comboBox;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton){
                if (tableModel.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Please do not forget to add product");
                }
                else{
                    waiter.createOrder(order);
                    JOptionPane.showMessageDialog(null, "Your order is completed.\n" +
                            "Total price is " + order.calculateTotalPrice() + " TL.");

                }
            }
            tableModel.setRowCount(0);
            this.comboBox.setSelectedItem(comboBox.getItemAt(0));
            order = new Order();
            productAddPanel.setVisible(false);
            currentOrder.setVisible(false);
            finalPanel.setVisible(false);
            mainPanel.setVisible(true);
        }
    }



}


