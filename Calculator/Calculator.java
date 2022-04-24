package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);

    JPanel topPanel = new JPanel();
    frame.add(topPanel, BorderLayout.NORTH);
    topPanel.setBackground(Color.WHITE);
    topPanel.setLayout(new BorderLayout());

    JLabel label = new JLabel(" ");
    label.setFont(new Font("Courier", Font.PLAIN, 20));
    topPanel.add(label, BorderLayout.EAST);


    JPanel mainPanel = new JPanel();
    frame.add(mainPanel, BorderLayout.CENTER);
    mainPanel.setLayout(new GridLayout(5,4));

    mainPanel.add(new JOperandButton("",label));
    mainPanel.add(new JOperandButton("",label));
    mainPanel.add(new JOperandButton("",label));
    JButton C = new JOperandButton("C",label);
    mainPanel.add(C);
    mainPanel.add(new JOperandButton("7",label));
    mainPanel.add(new JOperandButton("8",label));
    mainPanel.add(new JOperandButton("9",label));
    mainPanel.add(new JOperatorButton("/",label));
    mainPanel.add(new JOperandButton("4",label));
    mainPanel.add(new JOperandButton("5",label));
    mainPanel.add(new JOperandButton("6",label));
    mainPanel.add(new JOperatorButton("x",label));
    mainPanel.add(new JOperandButton("1",label));
    mainPanel.add(new JOperandButton("2",label));
    mainPanel.add(new JOperandButton("3",label));
    mainPanel.add(new JOperatorButton("-",label));
    mainPanel.add(new JOperandButton("0",label));
    mainPanel.add(new JOperandButton(".",label));
    mainPanel.add(new JOperatorButton("=",label));
    mainPanel.add(new JOperatorButton("+",label));


    frame.setVisible(true);
}
}
