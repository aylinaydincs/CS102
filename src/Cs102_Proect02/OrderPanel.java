package Cs102_Proect02;

import javax.swing.*;
import java.awt.*;

public class OrderPanel extends JPanel {
    private Restaurant restaurant;
    protected JButton newOrder;

    public OrderPanel(Restaurant restaurant) {
        this.restaurant = restaurant;
        setLayout(new FlowLayout());

        this.newOrder =new JButton("New Order");
        add(newOrder);
        newOrder.addActionListener(new OrderPanelListener());

    }

}


