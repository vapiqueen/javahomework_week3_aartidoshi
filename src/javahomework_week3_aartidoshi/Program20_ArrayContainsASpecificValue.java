package javahomework_week3_aartidoshi;
//20. Write a Java program to test if an array contains a specific value.

public class Program20_ArrayContainsASpecificValue {
    public static boolean contains(int[] array, int item) {
        for (int a : array) {
            if (item == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {7894, 9875, 98754, 3215, 324, 58798, 545, 8242, 8213, 012, 050654, 4885, 788888, 6545,};
        System.out.println(contains(array1, 788888));
        System.out.println(contains(array1, 888888));
    }
}

