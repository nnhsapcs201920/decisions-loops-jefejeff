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
        int rollDie = (int) ( Math.random() * 4 ) + 1;

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

    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = s.next();
        String str2 = s.next();

        if (str1 == str2)
        {
            System.out.println("String references are equal");
        }
        else
        {
            System.out.println("Strings references are not equal");
        }

        if (str1.equals(str2))
        {
            System.out.println("Strings are equal");   
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        /*
         * We will determine which string comes first lexographically using the compareTo method of the String class
         * 
         * compareTO returns an int:
         *  0: if the strings are equal (same sequences of characters)
         *  <0: if str1 < str2 lexographically
         *  >0: if str1 > str2 lexographiccaly
         */

        int result = str1.compareTo(str2);
        String firstStr = null;

        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }
        if(firstStr == null)
        {
            System.out.println("The first String is: " + firstStr);
            System.out.println("It's length is: " + firstStr.length());
        }
        else
        {
            System.out.println("Strings are equal");
        }

        System.out.println("The first String is: " + firstStr );
        System.out.println( "The length is: " + firstStr.length());
    }
}
