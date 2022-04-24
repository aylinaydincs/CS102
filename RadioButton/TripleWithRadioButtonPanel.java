package RadioButton;

import javax.swing.*;

public class TripleWithRadioButtonPanel extends JPanel {
    private JTextField textField;
    private JButton button, resetButton;
    private JLabel label;
    private JRadioButton radio1;
    private JRadioButton radio2;

    public TripleWithRadioButtonPanel() {
        textField = new JTextField(20);
        button = new JButton("Append");
        resetButton = new JButton("Reset");
        label = new JLabel("Hi.");
        radio1 = new JRadioButton("lowercase",true);
        radio2 = new JRadioButton("UPPERCASE", false);

        add(label);
        add(textField);
        add(button);
        add(resetButton);
        add(radio1);
        add(radio2);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        MyHandler listener = new MyHandler(radio1,radio2,label,textField,button,resetButton);
        button.addMouseListener(listener);
        resetButton.addMouseListener(listener);
        textField.addActionListener(listener);


    }
}

