
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @jcheng3
 * @version 11/9/2019
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5
         *  0 - - X - - -
         *  1 - - - X - -
         *  2 X X - - - -
         *  3 - - - - - -
         *  4 - - X - - -
         *  5 - - - - - -
         *  
         *    0 1 2 3 4 5
         *  0 - - - - - -
         *  1 - X X - - -
         *  2 - - - - - -
         *  3 - X - - - -
         *  4 - - - - - -
         *  5 - - - - - -
         *  
         *    0 1 2 3 4 5
         *  0 - - - - - -
         *  1 - - - - - -
         *  2 - X X - - -
         *  3 - - - - - -
         *  4 - - - - - -
         *  5 - - - - - -
         */
        final int ROWS = 6;
        final int COLS = 6;

        GameOfLife game = new GameOfLife(ROWS, COLS);
        game.populateGameTestMethod();
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 2) ||
                (row == 1 && col == 3) ||
                (row == 2 && col == 0) ||
                (row == 2 && col == 1) ||
                (row == 4 && col == 2))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations
        0 1 2 3 4 5
         *  0 - - - - - -
         *  1 - - - - - -
         *  2 - X X - - -
         *  3 - - - - - -
         *  4 - - - - - - 
         *  5 - - - - - -
         */

        // ...
        final int ROWS = 6;
        final int COLS = 6;

        GameOfLife game = new GameOfLife(ROWS, COLS);
        
        game.populateGameTestMethod();

        game.createNextGenerationTestMethod();
        game.createNextGenerationTestMethod();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 2 && col == 1) ||
                (row == 2 && col == 2)  )
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

