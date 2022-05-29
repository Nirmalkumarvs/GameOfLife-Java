package GameOfLife;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameOfLifeTest {
    @Test
    public void testGameOfLifeClassCanBeInitialized() {
        GameOfLife gameOfLife = new GameOfLife();
    }

    @Test
    public void testDirectionsAttributeIsAvailable() {
        GameOfLife gameOfLife = new GameOfLife();
        assertNotNull(gameOfLife.DIRECTIONS);
    }

    @Test
    public void testIsActiveCellMethodWorksWellForIndexWithoutActiveCell() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(5, 5);
        assertEquals(false, gameOfLife.isActiveCell(board, 2, 2));
    }

    @Test
    public void testIsActiveCellMethodWorksWellForIndexWithActiveCell() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(5, 5);
        board.board[2][2] = 1;
        assertEquals(true, gameOfLife.isActiveCell(board, 2, 2));
    }

    @Test
    public void testGetActiveNeighbourCellsCountMethodWorksWell() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(3, 3);
        board.board[0][0] = 1;
        board.board[0][1] = 1;
        board.board[0][2] = 1;
        assertEquals(3, gameOfLife.getActiveNeighbourCellsCount(board,1,1));
    }
}
