package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private TicTacToeGrid grid;
    private int row;
    private int column;

    public ButtonHandler(int row, int column, TicTacToeGrid grid, JButton[][] buttons) {
        this.grid = grid;
        this.row = row;
        this.column = column;

    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof JButton && !grid.opened(row,column)){
            TicTacToe.count++;
            JButton button = (JButton) actionEvent.getSource();
            if(TicTacToe.count % 2 == 1){
                button.setText("X");
                grid.setData(row,column,-1);
            }
            else{
                button.setText("O");
                grid.setData(row,column,1);
            }
            grid.openChange(row,column);
            grid.check();
        }
        if(TicTacToe.count == TicTacToe.SIZE*TicTacToe.SIZE){
            JOptionPane.showMessageDialog(null, "Friendship Won!!!");
            System.exit(0);
        }
    }

}
