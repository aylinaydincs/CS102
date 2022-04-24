package TicTacToe;

import javax.swing.*;

public class TicTacToeGrid {

    private int[][] data;
    private boolean[][] isOpened;

    public TicTacToeGrid(int numberOfRows, int numberOfColumns) {
        data = new int[numberOfRows][numberOfColumns];
        isOpened = new boolean[numberOfRows][numberOfColumns];
        check();
    }

    public void setData (int i, int j, int n) {
        data[i][j] = n;
    }

    public void openChange(int i, int j) {
        isOpened[i][j] = true;
    }
    public boolean opened(int i, int j) {
        return isOpened[i][j];
    }
    public String player(){
        String s;
        if(TicTacToe.count%2==1){
            s="Player of X";
        }
        else{
            s="Player of O";
        }
        return s;
    }

    public void check(){
        if(rowCheck()||columnCheck()||crossCheck()){
            JOptionPane.showMessageDialog(null, player()+ " WON!!!");
            System.exit(0);
        }

    }
    public boolean rowCheck(){
        return ((opened(0,0)&&opened(0,1)&&opened(0,2)&&(data[0][0] == data[0][1]) && (data[0][1] == data[0][2]))||
                (opened(1,0)&&opened(1,1)&&opened(1,2)&&(data[1][0] == data[1][1]) && (data[1][1]== data[1][2]))||
                (opened(2,0)&&opened(2,1)&&opened(2,2)&&(data[2][0] == data[2][1]) && (data[2][1] == data[2][2])));
    }
    public boolean columnCheck(){
        return ((opened(0,0)&&opened(1,0)&&opened(2,0)&&(data[0][0] == data[1][0]) && (data[1][0] == data[2][0]))||
                (opened(0,1)&&opened(1,1)&&opened(2,1)&&(data[0][1] == data[1][1]) && (data[1][1] == data[2][1]))||
                (opened(0,2)&&opened(1,2)&&opened(2,2)&&(data[0][2] == data[1][2]) && (data[1][2] == data[2][2])));
    }
    public boolean crossCheck(){
        return ((opened(0,0)&&opened(1,1)&&opened(2,2)&&(data[0][0] == data[1][1]) && (data[1][1]== data[2][2]))||
                (opened(0,2)&&opened(1,1)&&opened(2,0)&&(data[0][2] == data[1][1]) && (data[1][1]== data[2][0])));
    }


}
