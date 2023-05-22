package javahomework_week3_aartidoshi;
/**10.Write a java program to input any two number and ask user to enter their symbol (+, -,

 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)
 */

import java.util.Scanner;
public class Program10_Addition_Subtraction_Multiplication_and_Division {

        public static void main(String[] args) {

            Scanner s10 = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int x = s10.nextInt();
            System.out.println("Enter the second number : ");
            int y = s10.nextInt();
            System.out.println("Please select the calculation symbol +, -, *, / : ");
            char symbol = s10.next().charAt(0);
            doOperationBySelectingSymbol(x, y, symbol);

            s10.close();
        }
        public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
            if (symbol == '+') {
                System.out.println(x + " + " + y + " = " + (x + y));
            } else if (symbol == '-') {
                System.out.println(x + " - " + y + " = " + (x - y));
            } else if (symbol == '*') {
                System.out.println(x + " x " + y + " = " + (x * y));
            } else if (symbol == '/') {
                System.out.println(x + " / " + y + " = " + (x / y));
            } else {
                System.out.println("Please enter correct symbol +,-,*,/");
            }
        }
    }



