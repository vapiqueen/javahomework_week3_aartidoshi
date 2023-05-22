package javahomework_week3_aartidoshi;
//19. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class Program19_AverageValueOfArrayElements {
    public static void main(String[] args) {

        int[] nums = { 10,20,30,40,50,60,70,80,9010,90,100};

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int average = sum / nums.length;
        System.out.println("value of array elements are : " + Arrays.toString(nums));
        System.out.println("Average value of array iss : " + average);
    }
}


