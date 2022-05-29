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

    }
}
