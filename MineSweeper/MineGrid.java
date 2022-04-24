package MineSweeper;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

class MineGrid {
    private static final int MINE = -1;
    private int[][] mineInformation;
    private boolean[][] flag;
    private int numberOfMines;
    private int count = 0;
    private JButton[][] button;
    private ArrayList<JButton> open = new ArrayList<JButton>();

    public MineGrid(int numberOfRows, int numberOfColumns, int numberOfMines) {
        this.mineInformation = new int[numberOfRows][numberOfColumns];
        this.flag = new boolean[numberOfRows][numberOfColumns];
        this.button = new JButton[numberOfRows][numberOfColumns];
        this.initializeCells();
        this.placeMines(numberOfMines);
        this.setMineInformation();
        this.numberOfMines = numberOfMines;
    }

    private void initializeCells() {
        for (int i = 0; i < this.mineInformation.length; ++i) {
            for (int j = 0; j < this.mineInformation[0].length; ++j) {
                this.mineInformation[i][j] = 0;
            }
        }
    }

    private void placeMines(int numberOfMines) {
        Random random = new Random();
        for (int i = 0; i < numberOfMines; ++i) {
            int rowIndex = random.nextInt(mineInformation.length);
            int columnIndex = random.nextInt(mineInformation[0].length);
            if (this.mineInformation[rowIndex][columnIndex] != MINE) {
                this.mineInformation[rowIndex][columnIndex] = MINE;
            } else {
                --i;
            }
        }
    }

    private void incrementMineCountAt(int rowIndex, int columnIndex) {
        if (this.isInsideGrid(rowIndex, columnIndex) && !this.isMine(rowIndex, columnIndex)) {
            ++this.mineInformation[rowIndex][columnIndex];
        }
    }

    private void setMineInformation() {
        for (int i = 0; i < this.mineInformation.length; ++i) {
            for (int j = 0; j < this.mineInformation[0].length; ++j) {
                if (this.mineInformation[i][j] == MINE) {
                    // previous row
                    this.incrementMineCountAt(i - 1, j - 1);
                    this.incrementMineCountAt(i - 1, j);
                    this.incrementMineCountAt(i - 1, j + 1);

                    // left and right cells
                    this.incrementMineCountAt(i, j - 1);
                    this.incrementMineCountAt(i, j + 1);

                    // next row
                    this.incrementMineCountAt(i + 1, j - 1);
                    this.incrementMineCountAt(i + 1, j);
                    this.incrementMineCountAt(i + 1, j + 1);
                }
            }
        }
    }

    private boolean isInsideGrid(int rowIndex, int columnIndex) {
        return (rowIndex >= 0 && rowIndex < this.mineInformation.length) && (columnIndex >= 0 && columnIndex <
                this.mineInformation[0].length);
    }

    public boolean isMine(int rowIndex, int columnIndex) {
        return this.mineInformation[rowIndex][columnIndex] == MINE;
    }

    public int getCellContent(int rowIndex, int columnIndex) {
        return this.mineInformation[rowIndex][columnIndex];
    }

    public boolean isFlag(int row, int column) {
       return this.flag[row][column];
    }


    public void setFlag(boolean flag,int row, int column) {
        this.flag[row][column]= flag;

    }

    public JButton[][] getButton() {
        return button;
    }

    public ArrayList<JButton> getOpen() {
        return open;
    }

    public void flaggedMines(int row, int column) {
        if (this.getCellContent(row,column) == MINE && this.isFlag(row,column)) {
            this.count++;
            if (this.count == numberOfMines) {
                JOptionPane.showMessageDialog(null, "YOU'RE A GENIUS!");
                System.exit(0);
            }
        }
    }

    public void setButton(int row ,int column , JButton button){
        this.button[row][column] = button;
    }

    public void isOpenButton(int row,int column){
        open.add(button[row][column]);
    }

    public void openButtons (int row,int column){
        if(this.getCellContent(row,column) == 0) {
            for (int i=row-1;i<=row+1;++i){
                for(int j=column-1;j<=column+1;++j){
                    if(isInsideGrid(i,j) && !open.contains(button[i][j]) && !isFlag(i,j) ) {
                        button[i][j].setText(String.valueOf(this.getCellContent(i, j)));
                        isOpenButton(i,j);
                        openButtons(i, j);
                    }

                }
            }

        }
    }

}
