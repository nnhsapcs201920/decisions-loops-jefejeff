import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

import java.awt.Window;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JPanel;
import javax.swing.JToolTip;
import javax.swing.JViewport;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.ToolTipManager;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

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
    public static Villager villager = new Villager();
    public static Zombie zombie = new Zombie();

    //remove instance variables
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @param initialRows the number of rows, initialCols the number of columns
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife(int initialRows, int initialCols) //make constructor configurable
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(initialRows, initialCols);

        // create a world based on the grid
        world = new ActorWorld(grid);
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid for the test class
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGameTestMethod()  //change visibility to public
    {
        /* 
         *    0 1 2 3 4 5
         *  0 - - X - - -
         *  1 - - - X - -
         *  2 X X - - - -
         *  3 - - - - - -
         *  4 - - X - - -
         *  5 - - - - - -
         */
        // constants for the location of the cells initially alive
        final int X1 = 2, Y1 = 0;
        final int X2 = 3, Y2 = 1;
        final int X3 = 0, Y3 = 2;
        final int X4 = 1, Y4 = 2;
        final int X5 = 2, Y5 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add villagers (my live cells) to the intial locations
        villager.setColor();

        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, villager);

        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, villager);

        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, villager);

        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, villager);

        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, villager);

        // display the newly constructed and populated world
        world.show();
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid for the lab
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGame()  
    {
        //colors the cells
        villager.setColor();
        zombie.setColor();

        // constants for the location of the cells initially alive
        final int X1 = 0, Y1 = 10;
        final int X2 = 0, Y2 = 11;
        final int X3 = 1, Y3 = 10;
        final int X4 = 1, Y4 = 11;
        final int X5 = 4, Y5 = 13;
        final int X6 = 4, Y6 = 14;
        final int X7 = 5, Y7 = 13;
        final int X8 = 5, Y8 = 14;
        final int X9 = 7, Y9 = 10;
        final int X10 = 7, Y10 = 11;
        final int X11 = 8, Y11 = 10;
        final int X12 = 8, Y12 = 11;
        final int X13 = 20, Y13 = 21;
        final int X14 = 21, Y14 = 20;
        final int X15 = 21, Y15 = 21;
        final int X16 = 21, Y16 = 22;
        final int X17 = 22, Y17 = 19;
        final int X18 = 22, Y18 = 22;
        final int X19 = 22, Y19 = 23;
        final int X20 = 26, Y20 = 19;
        final int X21 = 26, Y21 = 20;
        final int X22 = 27, Y22 = 20;
        final int X23 = 27, Y23 = 21;
        final int X24 = 27, Y24 = 22;
        final int X25 = 28, Y25 = 21;
        final int X26 = 31, Y26 = 21;
        final int X27 = 31, Y27 = 22;
        final int X28 = 32, Y28 = 21;
        final int X29 = 32, Y29 = 22;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add villagers (my live cells) to the intial locations

        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, villager);

        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, villager);

        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, villager);

        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, villager);

        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, villager);

        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, villager);

        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, villager);

        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, villager);

        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, villager);

        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, villager);

        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, villager);

        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, villager);

        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, villager);

        Location loc14 = new Location(Y14, X14);
        grid.put(loc14, villager);

        Location loc15 = new Location(Y15, X15);
        grid.put(loc15, villager);

        Location loc16 = new Location(Y16, X16);
        grid.put(loc16, villager);

        Location loc17 = new Location(Y17, X17);
        grid.put(loc17, villager);

        Location loc18 = new Location(Y18, X18);
        grid.put(loc18, villager);

        Location loc19 = new Location(Y19, X19);
        grid.put(loc19, villager);

        Location loc20 = new Location(Y20, X20);
        grid.put(loc20, villager);

        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, villager);

        Location loc22 = new Location(Y22, X22);
        grid.put(loc22, villager);

        Location loc23 = new Location(Y23, X23);
        grid.put(loc23, villager);

        Location loc24 = new Location(Y24, X24);
        grid.put(loc24, villager);

        Location loc25 = new Location(Y25, X25);
        grid.put(loc25, villager);

        Location loc26 = new Location(Y26, X26);
        grid.put(loc26, villager);

        Location loc27 = new Location(Y27, X27);
        grid.put(loc27, villager);

        Location loc28 = new Location(Y28, X28);
        grid.put(loc28, villager);

        Location loc29 = new Location(Y29, X29);
        grid.put(loc29, villager);

        //create and add zombies (my dead cells) to the inital locations
        for(int i=0; i<this.world.getGrid().getNumRows(); i++)
        {
            for(int j=0; j<this.world.getGrid().getNumCols(); j++)
            {
                Location loc = new Location(i, j);
                Actor check = grid.get(loc);
                if(check != villager)
                {
                    grid.put(loc, zombie);   
                }
            }
        }
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
    public void createNextGenerationTestMethod()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        //creates new grid for next generation
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(grid.getNumRows(), grid.getNumCols());
        ActorWorld newWorld = new ActorWorld(newGrid);

        //updates next generation
        for(int i=0; i<this.world.getGrid().getNumRows(); i++)
        {
            for(int j=0; j<this.world.getGrid().getNumCols(); j++)
            {
                Location loc = new Location(i,j);
                ArrayList list = grid.getOccupiedAdjacentLocations(loc);
                int check = list.size();

                if(check == 2&&grid.get(loc)==villager)
                {
                    newGrid.put(loc, villager);
                }
                else if(check ==3)
                {
                    newGrid.put(loc, villager);   
                }
                else
                {
                }
            }
        }
        world = newWorld;
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

        //creates new grid for next generation
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(grid.getNumRows(), grid.getNumCols());
        ActorWorld newWorld = new ActorWorld(newGrid);

        //updates next generation
        for(int i=0; i<this.world.getGrid().getNumRows(); i++)
        {
            for(int j=0; j<this.world.getGrid().getNumCols(); j++)
            {
                Location loc = new Location(i,j);
                int liveCells = 0;

                for (int z = 0; z <= grid.getNeighbors(loc).size() - 1; z++)
                {
                    if (grid.getNeighbors(loc).get(z) == villager)
                    {
                        liveCells++;
                    }

                }
                if(liveCells == 2&&grid.get(loc)==villager)
                {
                    newGrid.put(loc, villager);
                }
                else if(liveCells ==3)
                {
                    newGrid.put(loc, villager);   
                }
                else
                {
                    newGrid.put(loc, zombie);
                }
            }
        }
        world = newWorld;
        world.show();
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
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return  this.world.getGrid().getNumRows();
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return  this.world.getGrid().getNumCols();
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        System.out.print('\u000C');
        Scanner s = new Scanner(System.in);
        System.out.println("Run test method or run actual lab?");
        System.out.println("");
        System.out.println("Enter 1 for test method.");
        System.out.println("Enter 2 for actual lab.");
        System.out.println();
        int which = s.nextInt();
        if(which==1)
        {
            // hard-code 6x6 grid
            GameOfLife game = new GameOfLife(6, 6);

            // populate the game
            game.populateGameTestMethod();
            Thread.sleep(999);

            /*
             * !!! Create a loop to repeatedly invoke the createNextGeneration method.
             *      You can have your program pause between each invocation:
             *          Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
             */ 
            game.createNextGenerationTestMethod();
            Thread.sleep(999);
            game.createNextGenerationTestMethod();
            Thread.sleep(999);
            System.out.print("This is the final grid after 3 generations");
        }
        else if(which==2)
        {
            // hard-code 6x6 grid
            GameOfLife game = new GameOfLife(33, 33);

            // populate the game
            game.populateGame();
            Thread.sleep(777);
            /*
             * !!! Create a loop to repeatedly invoke the createNextGeneration method.
             *      You can have your program pause between each invocation:
             *          Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
             */ 
            do
            {

                game.createNextGeneration();
                Thread.sleep(777);
            }
            while (true);
        }
    }

}
