package RadioButtonPanel;
import javax.swing.*;
import java.awt.*;

public class TripleWithRadioButtons {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.add(new TripleWithRadioButtonsPanel());
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(200, 200);
        app.setVisible(true);
    }
}
