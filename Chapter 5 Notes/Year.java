
/**
 * A way to determine if a year is a leap year
 *
 * @author jcheng3
 * @version 10/21/2019
 */
public class Year
{
    public static void Year(int year)
    {
         if (year%4==0 && year%100!=0)
         {
             System.out.print("Leap year");
             
            }
         else if (year%400==0)
         {
             System.out.print("Leap year");
            }
            else
            {
             System.out.print("Not a leap year");   
            }
    }
}
