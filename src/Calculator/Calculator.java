package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    JFrame frame =new JFrame();

    public Calculator (){
        frame.setSize(300,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        frame.add(topPanel, BorderLayout.NORTH );
        topPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        topPanel.setBackground(Color.WHITE);
        JLabel label =new JLabel("0");
        label.setFont(new Font("Courier", Font.PLAIN, 20));
        topPanel.add(label);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new GridLayout(4,4));
        mainPanel.add(new JOperandButton("7"));
        mainPanel.add(new JOperandButton("8"));
        mainPanel.add(new JOperandButton("9"));
        mainPanel.add(new JOperatorButton("/"));

        mainPanel.add(new JOperandButton("4"));
        mainPanel.add(new JOperandButton("5"));
        mainPanel.add(new JOperandButton("6"));
        mainPanel.add(new JOperatorButton("x"));

        mainPanel.add(new JOperandButton("1"));
        mainPanel.add(new JOperandButton("2"));
        mainPanel.add(new JOperandButton("3"));
        mainPanel.add(new JOperatorButton("-"));

        mainPanel.add(new JOperandButton("0"));
        mainPanel.add(new JOperandButton("."));
        mainPanel.add(new JOperatorButton("="));
        mainPanel.add(new JOperatorButton("+"));
        frame.add(mainPanel);

        frame.setVisible(true);


    }
}
