package GameOfLife;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(3, gameOfLife.getActiveNeighbourCellsCount(board, 1, 1));
    }

    @Test
    public void testPlayTheGameMethodExists() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(3, 3);
        gameOfLife.playTheGame(board);
    }

    @Test
    public void testActiveCellWithFourOrMoreActiveNeighborsDiesCondition() {
        GameOfLife gameOfLife = new GameOfLife();

        Board boardObj1 = new Board(5, 5);
        Board boardObj2 = new Board(5, 5);

        boardObj1.board[0][0] = 1;
        boardObj1.board[0][2] = 1;
        boardObj1.board[1][1] = 1;
        boardObj1.board[2][0] = 1;
        boardObj1.board[2][2] = 1;

        boardObj2.board[0][1] = 1;
        boardObj2.board[2][1] = 1;
        boardObj2.board[1][0] = 1;
        boardObj2.board[1][2] = 1;

        gameOfLife.playTheGame(boardObj1);

        assertArrayEquals(boardObj2.board, boardObj1.board);
    }

    @Test
    public void testActiveCellWithLessThanTwoActiveNeighborsDiesCondition() {
        GameOfLife gameOfLife = new GameOfLife();

        Board boardObj1 = new Board(5, 5);
        Board boardObj2 = new Board(5, 5);

        boardObj1.board[0][0] = 1;
        boardObj1.board[0][2] = 1;
        boardObj1.board[2][0] = 1;
        boardObj1.board[2][2] = 1;

        gameOfLife.playTheGame(boardObj1);

        assertArrayEquals(boardObj2.board, boardObj1.board);
    }

    @Test
    public void testDeadCellWithThreeActiveNeighborsBecamesActiveCellCondition() {
        GameOfLife gameOfLife = new GameOfLife();

        Board boardObj1 = new Board(5, 5);
        Board boardObj2 = new Board(5, 5);

        boardObj1.board[0][0] = 1;
        boardObj1.board[0][2] = 1;
        boardObj1.board[2][0] = 1;

        boardObj2.board[1][1] = 1;

        gameOfLife.playTheGame(boardObj1);

        assertArrayEquals(boardObj2.board, boardObj1.board);
    }

    @Test
    public void testMakeItAsActiveCellMethodWorks() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(5, 5);
        gameOfLife.makeItAsActiveCell(board, 1, 1);
        assertEquals(1, board.board[1][1]);
    }

    @Test
    public void testMakeItAsDeadCellMethodWorks() {
        GameOfLife gameOfLife = new GameOfLife();
        Board board = new Board(5, 5);
        board.board[1][1] = 1;
        gameOfLife.makeItAsDeadCell(board, 1, 1);
        assertEquals(0, board.board[1][1]);
    }


}
