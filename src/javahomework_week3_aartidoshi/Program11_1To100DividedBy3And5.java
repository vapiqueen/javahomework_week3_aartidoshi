package javahomework_week3_aartidoshi;

public class Program11_1To100DividedBy3And5 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        division3();
        System.out.println("        ");
        System.out.println("Number divisible by 5 are: ");
        division5();
    }

    public static void division3() {
        for(int i = 1;i < 100;i++)
            if(i % 3 == 0)
                System.out.print(i + " , ");
    }

    public static void division5() {
        for (int i = 1;i < 100;i++)
            if(i % 5 == 0)
                System.out.print(i + " , ");
    }
}
