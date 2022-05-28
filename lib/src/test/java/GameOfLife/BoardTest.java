package GameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
