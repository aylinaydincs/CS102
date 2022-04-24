package Calculator;

import javax.swing.*;
import java.awt.*;

public class JOperandButton extends JButton {
    public JOperandButton (String text,JLabel label) {
        super(text);
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Courier", Font.PLAIN, 20));
        addActionListener(new MyCalculatorListener(label));
    }

}
