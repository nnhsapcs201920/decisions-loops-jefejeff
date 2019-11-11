import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author jcheng3
 * @version 11/9/2019
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 33 rows and 33 columns
    private final int ROWS = 5;
    private final int COLS = 5;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGame()
    {
        /* 
         *    0 1 2 3 4
         *  0 - - X - -
         *  1 - - - X -
         *  2 X X - - -
         *  3 - - - - -
         *  4 - - X - -
         */
        // constants for the location of the three cells initially alive
        final int X1 = 2, Y1 = 0;
        final int X2 = 3, Y2 = 1;
        final int X3 = 0, Y3 = 2;
        final int X4 = 1, Y4 = 2;
        final int X5 = 2, Y5 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add villagers (a type of Actor) to the three intial locations
        Villager villager1 = new Villager();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, villager1);

        Villager villager2 = new Villager();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, villager2);

        Villager villager3 = new Villager();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, villager3);

        Villager villager4 = new Villager();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, villager4);

        Villager villager5 = new Villager();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, villager5);

        // display the newly constructed and populated world
        world.show();
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        //updates next generation
        for(int i=0; i<ROWS; i++)
        {
            for(int j=0; j<COLS; j++)
            {
               this.getActor(i, j);
            }
        }
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }
    
    /**
     * Returns number of neighbors which are Villagers (alive cells) at the specified row and column
     */
    public int getVillagers(int row, int col)
    {
        Location loc1 = new Location(row-1, col-1);
        
        return 3;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();

        // populate the game
        game.populateGame();

        /*
         * !!! Create a loop to repeatedly invoke the createNextGeneration method.
         *      You can have your program pause between each invocation:
         *          Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
         */ 
    }

}
