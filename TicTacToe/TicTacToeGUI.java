package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToeGUI extends JPanel {
    private TicTacToeGrid grid;
    private JButton[][] buttons;

    public TicTacToeGUI (int numberOfRows, int numberOfColumns){
        buttons = new JButton[numberOfRows][numberOfColumns];
        this.grid = new TicTacToeGrid(numberOfRows,numberOfColumns);
        this.setLayout(new GridLayout(numberOfRows, numberOfColumns));
        for (int i = 0; i < numberOfRows; ++i) {
            for (int j = 0; j < numberOfRows; ++j) {
                ButtonHandler buttonHandler = new ButtonHandler(i, j, grid, buttons);
                buttons[i][j] = new JButton();
                add(buttons[i][j]);
                buttons[i][j].addActionListener(buttonHandler);
            }
        }

    }
}
