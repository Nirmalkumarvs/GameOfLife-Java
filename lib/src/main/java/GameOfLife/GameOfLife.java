package GameOfLife;

public class GameOfLife {
    public int DIRECTIONS[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    final int ACTIVE_CELL = 1;

    final int DEAD_CELL = 0;

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
        Board nextGenerationBoard = new Board(board.rowLength, board.columnLength);
        for (int rowIndex = 0; rowIndex < board.rowLength; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board.columnLength; columnIndex++) {
                int activeNeighbourCellsCount = this.getActiveNeighbourCellsCount(board, rowIndex, columnIndex);
                if (this.isActiveCell(board, rowIndex, columnIndex)) {
                    if (activeNeighbourCellsCount < 2 || activeNeighbourCellsCount > 3)
                        makeItAsDeadCell(nextGenerationBoard, rowIndex, columnIndex);
                    else
                        makeItAsActiveCell(nextGenerationBoard, rowIndex, columnIndex);
                } else {
                    if (activeNeighbourCellsCount == 3)
                        makeItAsActiveCell(nextGenerationBoard, rowIndex, columnIndex);
                    else
                        makeItAsDeadCell(nextGenerationBoard, rowIndex, columnIndex);
                }
            }
        }

        for (int rowIndex = 0; rowIndex < board.rowLength; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board.columnLength; columnIndex++) {
                board.board[rowIndex][columnIndex] = nextGenerationBoard.board[rowIndex][columnIndex];
            }
        }
    }

    public void makeItAsActiveCell(Board board, int rowIndex, int columnIndex) {
        board.board[rowIndex][columnIndex] = ACTIVE_CELL;
    }

    public void makeItAsDeadCell(Board board, int rowIndex, int columnIndex) {
        board.board[rowIndex][columnIndex] = DEAD_CELL;
    }
}
