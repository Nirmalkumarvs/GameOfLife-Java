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

}
