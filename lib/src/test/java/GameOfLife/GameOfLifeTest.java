package GameOfLife;


import org.junit.jupiter.api.Test;

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

}
