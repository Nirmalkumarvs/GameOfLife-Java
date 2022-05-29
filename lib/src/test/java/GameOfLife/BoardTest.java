package GameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BoardTest {

    @Test
    public void testBoardClassCanBeInitializedWithDimensions() {
        Board board = new Board(1, 1);
    }

    @Test
    public void testRowLengthIsAssignedCorrectly() {
        Board board = new Board(5, 1);
        assertEquals(board.rowLength, 5);
    }

    @Test
    public void testColumnLengthAssignedCorrectly() {
        Board board = new Board(5, 6);
        assertEquals(board.columnLength, 6);
    }

    @Test
    public void testBoardMatrixIsCreated() {
        Board board = new Board(2, 3);
        assertNotNull(board.board);
    }

    @Test
    public void testBoardMatrixIsCreatedWithSpecifiedRowLength() {
        Board board = new Board(5, 6);
        assertEquals(board.board.length, 5);
    }

    @Test
    public void testBoardMatrixIsCreatedWithSpecifiedColumnLength() {
        Board board = new Board(5, 6);
        assertEquals(board.board[0].length, 6);
    }

}
