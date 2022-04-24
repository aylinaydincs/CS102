package Calculator;

import javax.swing.*;
import java.awt.*;

public class JOperatorButton extends JButton  {

    public JOperatorButton (String text,JLabel label) {
        super(text);
        this.setBackground(Color.LIGHT_GRAY);
        this.setFont(new Font("Courier", Font.PLAIN, 20));
        addActionListener(new MyCalculatorListener(label));
    }



}
