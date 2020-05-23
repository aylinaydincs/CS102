package Cs102_Proect02;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        JFrame frame = new JFrame("Project");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);
        frame.setMinimumSize(new Dimension(650, 500));

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel orderPanel = new OrderPanel(restaurant);
        tabbedPane.add("Order", orderPanel);

        JPanel restaurantPanel = new RestaurantPanel(restaurant);
        tabbedPane.add("Restaurant", restaurantPanel);


        frame.add(tabbedPane);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
