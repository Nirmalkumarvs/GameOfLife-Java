package GameOfLife;

public class GameOfLife {
    public int DIRECTIONS[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    final int ACTIVE_CELL = 1;

    public Boolean isActiveCell(Board board, int rowIndex, int columnIndex) {
        if (board.board[rowIndex][columnIndex] == ACTIVE_CELL)
            return true;
        else
            return false;
    }

    public int getActiveNeighbourCellsCount(Board board, int rowIndex, int columnIndex) {
        int activeNeighbourCellsCount = 0;
        for (int[] direction : DIRECTIONS) {
            int neighbourRowIndex = rowIndex + direction[0];
            int neighbourColumnIndex = columnIndex + direction[1];
            if (board.isValidIndex(neighbourRowIndex, neighbourColumnIndex)) {
                if (this.isActiveCell(board, neighbourRowIndex, neighbourColumnIndex)) {
                    activeNeighbourCellsCount += 1;
                }
            }
        }
        return activeNeighbourCellsCount;
    }


    public void playTheGame(Board board) {
        int[][] nextGenerationBoard = new int[board.rowLength][board.columnLength];

        for (int rowIndex = 0; rowIndex < board.rowLength; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board.columnLength; columnIndex++) {
                int activeNeighbourCellsCount = this.getActiveNeighbourCellsCount(board, rowIndex, columnIndex);
                if (this.isActiveCell(board, rowIndex, columnIndex)) {
                    if (activeNeighbourCellsCount<2 || activeNeighbourCellsCount > 3)
                        nextGenerationBoard[rowIndex][columnIndex] = 0;
                }
            }
        }

        for (int rowIndex = 0; rowIndex < board.rowLength; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board.columnLength; columnIndex++) {
                board.board[rowIndex][columnIndex] = nextGenerationBoard[rowIndex][columnIndex];
            }
        }
    }
}
