import java.util.Scanner;
/**
 * Notes on loops
 * 
 * @author jcheng3
 * @version 10/24/2019
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *     evaluates a boolean expression
         *         if true, executes the body of the loop and then re-evaluates the condition
         *         if false, skips the body of the loop and continues sequentiall
         */
        int count = 1;                 //initializaiton

        while( count<= 5)          //condition
        {
            System.out.println(count);     //body
            count++;                       //update the condition variable
        }

        System.out.println("done");
    }

    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop
         */

        int count = 1;                 //initializaiton

        while( count!= 50)          //condition
        {
            System.out.println(count);     //body
            count+=2;                       //update the condition variable
        }

        System.out.println("done");
    }

    public static void forExample()
    {
        /*
         * for loop:
         *     three parts of the for statement:
         *         1. initialization - executed once
         *         2. boolean expression - tested at the start of every iteration
         *         3. updating the condition variable - executed at the end of each iteration before testing the condition again
         */   
        for(int count = 1;                     //initialization
        count<=5;                              //boolean expression (loop condition)
        count++)                               //update the condition variable
        {
            System.out.println(count);         //body
        }
        System.out.println("done");

        /*
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("Final value of count: " + count);
    }

    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. executes the body of the loop
         *      2. evaluates the loop condition
         *          if true, executes body of loop again
         *          if false, continues after loop
         */    
        int count = 1;              //initialization

        do
        {
            System.out.println(count);      //body
            count++;                        //updating the condition
        }
        while( count<=5 );                  //condition

        System.out.println("done");
    }
}
