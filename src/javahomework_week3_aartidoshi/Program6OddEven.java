package javahomework_week3_aartidoshi;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6OddEven {
    public static void main(String[] args) {

        Scanner s6 = new Scanner(System.in);
        System.out.println("Enter the value to check ODD or EVEN number : ");
        int number = s6.nextInt();
        Program6OddEven oddEven = new Program6OddEven();
        System.out.println(number + " is " + oddEven.isItEvenorOddNumber(number) + " number ");
        s6.close();
    }

    public String isItEvenorOddNumber(int number){
        if (number % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
}
