package GameOfLife;

public class Board {
    public int rowLength;
    public int columnLength;
    public int[][] board;

    public Board(int rowLength, int columnLength) {
        this.rowLength = rowLength;
        this.columnLength = columnLength;
        this.board = new int[rowLength][columnLength];
    }

    public Boolean isValidIndex(int rowIndex, int columnIndex) {
        if (rowIndex >= 0 && rowIndex < this.rowLength && columnIndex >= 0 && columnIndex < this.columnLength)
            return true;
        else
            return false;
    }
}
