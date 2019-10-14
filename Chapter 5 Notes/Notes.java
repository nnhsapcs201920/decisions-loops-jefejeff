import java.util.Scanner;

/**
 * Chapter 5 Notes -- decisions
 *
 * @author jcheng3
 * @version 14oct2019
 */
public class Notes
{
    public static void ifExample()
    {
        //model a coin flip. 1:heads, 0:tails
        int coinFlip = (int) ( Math.random() * 2 );
        /*
         * if statement
         *      statements that are executed if the conditional expression is true
         *      conditional expression must go inside the parentheses
         *      statements are grouped by blocks (i,e, {} )
         *          not indented like in Python
         *      no colon after the conditional expression in Java
         */
        if (coinFlip == 1)
        {
            System.out.println("HEADS");
        }
        
        /*
         *  {} are not required if it's a single statement
         *          However they are always a good idea
         */
        
        /*
         * if else statement
         *      else block will execute if the condition is false
         */
        else
        {
            System.out.println("TAILS");
        }
        
        //challenge: roll a 4 sided die and print the value that came up.
        int rollDie = (int) ( Math.random() * 4 ) +1;
        
        if (rollDie == 1)
        {
            System.out.println("1");
        }
        else if (rollDie == 2)
        {
            System.out.println("2");
        }
        else if (rollDie == 3)
        {
            System.out.println("3");
        }
        else if (rollDie == 4)
        {
            System.out.println("4");
        }
    }
    
    public static boolean doublesAreEqual( double num1, double num2 )
    {
        final double Epsilon = 1e-14; 
        
        if( Math.abs(num1-num2) < Epsilon)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
