package javahomework_week3_aartidoshi;

import java.util.Scanner;
/**
 *1. Write a java program that tells us that Input number is odd or even?
 *HINT: use ternary operator (? :)
 */
public class Program1_OddOrEven {

    public static void main(String[] args) {

        Scanner s1 =new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = s1.nextInt();
        s1.close();

        String evenOdd = (num % 2 ==0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);

    }

}
