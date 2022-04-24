package RadioButton;

import javax.swing.*;
import java.awt.event.*;

public class MyHandler extends MouseAdapter implements ActionListener {
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JButton resetButton;

    public MyHandler(JRadioButton radio1, JRadioButton radio2, JLabel label, JTextField textField, JButton button, JButton resetButton) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.label = label;
        this.textField = textField;
        this.button = button;
        this.resetButton = resetButton;
    }

    public void mouseClicked(MouseEvent event) {
        if(event.getSource() == button){
            if(radio1.isSelected() ) {
                label.setText(label.getText() + textField.getText().toLowerCase());
                textField.setText("");
            }
            if(radio2.isSelected() ) {
                label.setText(label.getText() + textField.getText().toUpperCase());
                textField.setText("");
            }
        }
        if (event.getSource() == resetButton){
            label.setText("Hi.");
            textField.setText("");
            radio1.setSelected(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(radio1.isSelected() ) {
            label.setText(label.getText() + textField.getText().toLowerCase());
            textField.setText("");
        }
        if(radio2.isSelected() ) {
            label.setText(label.getText() + textField.getText().toUpperCase());
            textField.setText("");
        }
    }
}
