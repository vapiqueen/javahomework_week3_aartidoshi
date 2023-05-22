package javahomework_week3_aartidoshi;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO

import java.util.Scanner;

public class Program16_NegativePositiveNumber {

    public static void main(String[] args) {
        Scanner S16 =new Scanner(System.in);
        System.out.println("Enter a number");
        int a = S16.nextInt();
        S16.close();

        numberPositiveNegative(a);

    }

    public static void numberPositiveNegative(int a) {
        if (a > 0 ){
            System.out.println(a + "is an positive number");
        }else if (a < 0) {
            System.out.println(a + "is a negative number");
        }else{
            System.out.println(a + " is zero");
        }

    }

}

