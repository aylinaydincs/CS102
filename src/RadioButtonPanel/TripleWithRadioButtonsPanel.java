package RadioButtonPanel;

import javax.swing.*;
import java.awt.*;


public class TripleWithRadioButtonsPanel extends JPanel {

    public TripleWithRadioButtonsPanel() {

        JLabel label =new JLabel("Hi.");
            add(label);

        JTextField textField = new JTextField();
            textField.setBackground(Color.WHITE);
            textField.setColumns(17);
            add(textField);

        JButton button1 = new JButton("Append");
            add(button1);

        JButton button2 = new JButton("Reset");
            add(button2);

        ButtonGroup group = new ButtonGroup();
         JRadioButton radio1 = new JRadioButton("lowercase");
            add(radio1);
            group.add(radio1);
         JRadioButton radio2 = new JRadioButton("UPPERCASE");
            add(radio2);
            group.add(radio2);








    }
}
