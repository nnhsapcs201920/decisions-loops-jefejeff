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
        if(firstStr != null)
        {
            System.out.println("The first String is: " + firstStr);
            System.out.println("It's length is: " + firstStr.length());
        }
        else
        {
            System.out.println("Strings are equal");
        }
        /*
         * This is an example of a "short-circuit"
         *      If the left operand is false, the right operand will not be evaluated because the AND is already false
         */
        System.out.print("Enter your two favorite fruits.");
        if(s.next().equals("kiwi")||s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorite fruits too!");
        }
        
        System.out.println("Enter your favorite ice cream flavor.");
        String flavor = s.next();
        System.out.println("Favorite flavor: " + flavor);
    }
    
    public static String getStudentClass(int gradeNumber)
    {
        /*
         * Switch statement
         *      another conditional statement (like if statement)
         *      preferred when evaluating *discrete* values
         *      can be used for byte, short, int, and char primitive types
         *      can also be used for enumerations and String objects
         *      the condition is evaluated and flow of execution jumps to whichever case matches
         */
        
        String studentClass = "";
        
        switch (gradeNumber)
        {
            case 9:
            {
                studentClass = "freshman";
                /*
                 * break causes the flow of execution to leave the switch
                 * 
                 *      (without a break, the flow of excecution continues into the next case.)
                 */
                break;
            }
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            case 11:
            {
                studentClass = "junior";
                break;
            }
            case 12:
            {
                studentClass = "senior";
                break;
            }
            /*
             * by leaving out the break, multiple cases can run the same code.
             */
            case 6:
            case 7:
            case 8:
            {
                studentClass = "junior high";
                break;
            }
            /*
             * default matches everything not matched by one of the cases
             */
            default:
            {
                studentClass = "elementary";
                break;
            }
        }
        
        return studentClass;
    }
    
    public static void assignmentOperatorExample()
    {
        /*
         * augmented assignment operators: +=, -=, *=, /=, %=
         *      same as in Python
         *      perform the specified operation and then assign the resulting value to a variable
         */
        
        int x = 7;
        int y = 7;
        int z = 7;
        
        x = x + 1;
        y += 1;
        z++; //most common in Java
        
        System.out.println("x = " + x + "; y = " + y + "; z = " + z);
        
        /*
         * post increment/decrement operator
         *      equivalent to adding/subtracting 1
         *      returns the value before performing the increment/decrement
         */
        
        int a = 7;
        int b = a++;
        System.out.println("a = " + a + "; b = " + b);
        
        /*
         * pre increment/decrement operator
         *      returns the value after performing the increment/decrement
         */
        int c = 7;
        int d = ++c;
        System.out.println("c = " + c + "; d = " + d);
    }
}
