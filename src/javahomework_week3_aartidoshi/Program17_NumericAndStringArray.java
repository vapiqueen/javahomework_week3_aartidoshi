package javahomework_week3_aartidoshi;
//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program17_NumericAndStringArray {
    public static void main(String[] args) {
        int[] numArray = {1200, 5415, 1995, 1929, 707, 1677, 8797, 123 };
        String [] strArray = {"Aarti", "Jaydeep", "Riya", "Komal","Sarvat", "Mukesh", "Jasmeen"};

        System.out.println("Actual Numerical Arrays were : " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Arrays are : " + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Arrays were :  " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted String Arrays are : " + Arrays.toString(strArray));

    }

}

