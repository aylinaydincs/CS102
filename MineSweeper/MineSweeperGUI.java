package MineSweeper;

import javax.swing.*;
import java.awt.*;

class MineSweeperGUI extends JPanel {
    private MineGrid mineGrid;

    public MineSweeperGUI(int numberOfRows, int numberOfColumns, int numberOfMines) {
        this.mineGrid = new MineGrid(numberOfRows, numberOfColumns, numberOfMines);
        this.setLayout(new GridLayout(numberOfRows, numberOfColumns));

        for (int i = 0; i < numberOfRows; ++i) {
            for (int j = 0; j < numberOfColumns; ++j) {
                JButton button = new JButton();
                button.addActionListener(new ButtonHandler(i, j, this.mineGrid));
                button.addMouseListener(new ButtonHandler(i,j,this.mineGrid));
                add(button);
                this.mineGrid.setButton(i,j,button);
            }
        }
    }

}
