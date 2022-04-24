package RadioButton;

import javax.swing.*;
import java.awt.event.MouseListener;

public class TripleWithRadioButtons {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.add(new TripleWithRadioButtonPanel());
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(200, 200);
        app.setVisible(true);


    }
}

