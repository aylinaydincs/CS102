package Cs102_Proect02;

import javax.swing.*;

public class OrderPanel extends JPanel {
    private Restaurant restaurant;
    private  JPanel first;
    private  JPanel productAdd;
    private  JPanel currentOrder;
    private  JPanel finalPanel;

    public OrderPanel(Restaurant restaurant) {
        this.restaurant = restaurant;

        JPanel mainPanel = new JPanel();
        JButton newOrder =new JButton("New Order");
        mainPanel.add(newOrder);

    }

}


