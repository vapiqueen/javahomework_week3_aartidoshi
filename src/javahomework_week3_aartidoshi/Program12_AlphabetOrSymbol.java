package javahomework_week3_aartidoshi;
//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;
public class Program12_AlphabetOrSymbol {
    public static void main(String[] args) {

        Scanner s12 = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = s12.next().charAt(0);

        Program12_AlphabetOrSymbol inputValue = new Program12_AlphabetOrSymbol();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

        s12.close();
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
    }
}

