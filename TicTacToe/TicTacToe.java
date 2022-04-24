package TicTacToe;

import javax.swing.*;

public class TicTacToe {
    protected static final int SIZE = 3;
    protected static int count = 0;

    public static void  main (String []args){
        JFrame frame = new JFrame();
        frame.add(new TicTacToeGUI(SIZE ,SIZE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        while(count<=9){
            if(count%2==1)
                frame.setTitle("Player of O");
            else
                frame.setTitle("Player of X");
        }

    }
}
