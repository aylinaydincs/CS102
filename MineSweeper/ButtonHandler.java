package MineSweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonHandler extends MouseAdapter implements ActionListener {
    private int row;
    private int column;
    private MineGrid mineGrid;


    public ButtonHandler(int row, int column, MineGrid mineGrid) {
        this.row = row;
        this.column = column;
        this.mineGrid = mineGrid;

    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.mineGrid.isMine(this.row, this.column)) {
            JOptionPane.showMessageDialog(null, "GAME OVER!");
            System.exit(0);
        } else {
            if (actionEvent.getSource() instanceof JButton && !this.mineGrid.isFlag(row,column) && !this.mineGrid.getOpen().contains(this.mineGrid.getButton()[row][column])) {
                JButton button = (JButton) actionEvent.getSource();
                button.setText(String.valueOf(this.mineGrid.getCellContent(this.row, this.column)));
                this.mineGrid.isOpenButton(row,column);
                this.mineGrid.openButtons(this.row, this.column);
            }
        }
    }

    public void mousePressed( MouseEvent me){
        JButton button = (JButton) me.getSource();
        if(SwingUtilities.isRightMouseButton(me)){
            if (!this.mineGrid.isFlag(row,column) && !this.mineGrid.getOpen().contains(this.mineGrid.getButton()[row][column])) {
                button.setIcon(new ImageIcon("flag.png"));
                this.mineGrid.setFlag(true,row,column);
                this.mineGrid.flaggedMines(row,column);

            } else if (this.mineGrid.isFlag(row,column)) {
                button.setIcon(new ImageIcon());
                this.mineGrid.setFlag(false,row,column);
            }
        }
    }


}
