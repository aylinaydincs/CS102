package Cs102_Proect02;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrderPanel extends JPanel {
    private Restaurant restaurant;
    private  JPanel mainPanel;
    private  JPanel productAddPanel;
    private  JPanel currentOrder;
    private  JPanel finalPanel;

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
        this.productAddPanel.add(product);
        JComboBox selectProduct = new JComboBox();
        addingProduct(selectProduct);
        this.productAddPanel.add(selectProduct);
        JLabel count = new JLabel("Count:");
        this.productAddPanel.add(count);
        JSpinner spinner = new JSpinner();
        this.productAddPanel.add(spinner);
        JLabel price = new JLabel("Price:");
        this.productAddPanel.add(price);
        JLabel priceDisplay = new JLabel("0,00 TL");
        this.productAddPanel.add(priceDisplay);
        JButton addButton = new JButton("Add");
        this.productAddPanel.add(addButton);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Product Name");
        model.addColumn("Count");
        model.addColumn("Price");
        add(productAddPanel);

        this.currentOrder = new JPanel();
        JTable orderTable = new JTable(model);
        this.currentOrder.add(orderTable);
        orderTable.setPreferredScrollableViewportSize(new Dimension(600, 200));
        this.currentOrder.add(new JScrollPane(orderTable));
        add(currentOrder);




    }
    private void addingProduct(JComboBox comboBox){
        for(int i=0;i<restaurant.getProducts().size();++i){
            comboBox.addItem(restaurant.getProducts().get(i).getName());
        }
    }

}


