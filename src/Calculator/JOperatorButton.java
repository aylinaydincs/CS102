package Calculator;

import javax.swing.*;
import java.awt.*;

public class JOperatorButton extends JButton {
    public JOperatorButton(String text) {
        super(text);
        setBackground(Color.LIGHT_GRAY);
        setFont(new Font("Courier", Font.PLAIN, 20));
    }
}
