package javahomework_week3_aartidoshi;

import java.util.Scanner;

/**2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Program2_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Input  any the year: ");
        int year = s2.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
