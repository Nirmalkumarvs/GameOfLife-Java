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

}
