package javahomework_week3_aartidoshi;
/**3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 *English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 *Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 *%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
 | |
 | Mark Sheet |
 |_______________________________|
 | Name : Jay |
 | Roll No: 08 |
 |_______________________________|
 | Subjects : Marks |
 |_______________________________|
 | Math : 98 |
 | Science : 90 |
 | English : 85 |
 |_______________________________|
 | Total : 273 |
 |_______________________________|
 | Percentage : 91.0 |
 | Result : Pass |
 | Grade : A+ |
 |_______________________________|

 */

import java.util.Scanner;
public class Program3_MarkSheet {

    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String Name = x1.next();
        System.out.print("Enter Roll Number : ");
        int RollNum = x1.nextInt();
        System.out.print("Enter Marks for Maths : ");
        int Maths = x1.nextInt();
        if (Maths < 0 || Maths > 100) {
            System.out.print("Invalid input, Marks must be between 0 to 100 range");
            System.out.print("Please Enter Correct Marks again : ");
            Maths = x1.nextInt();
        }
        System.out.print("Enter Marks for Science :");
        int Science = x1.nextInt();
        if (Science < 0 || Science > 100) {
            System.out.print("Invalid input, Marks must be between 0 to 100 range");
            System.out.print("Please Enter Correct Marks again :");
            Science = x1.nextInt();
        }
        System.out.print("Enter Marks for English : ");
        int English = x1.nextInt();
        if (English < 0 || English > 100) {
            System.out.print("Invalid input, Marks must be between 0 to 100 range");
            System.out.print("Please Enter Correct Marks again :");
            English = x1.nextInt();
        }
        int total = sum(Maths, Science, English);
        int percentage = (total * 100) / 300;
        String Result = calculateResult(Maths, Science, English);
        String Grade = calculateGrade(percentage, Result);
        printTheMarkSheet(Name, RollNum, Maths, Science, English, total, percentage, Result, Grade);

        x1.close();
    }


    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int Maths, int Science, int English) {
        if (Maths < 35 || Science < 35 || English < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String Result) {
        String Grade = null;
        if (Result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                Grade = "A+";
            } else if (percentage >= 60) {
                Grade = "A";
            } else if (percentage >= 50) {
                Grade = "B";
            } else if (percentage >= 35) {
                Grade = "C";
            }
        } else {
            Grade = "-";
        }
        return Grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String Name, int RollNo, int Maths, int Science,
                                         int English, double Total, double Percentage, String Result,
                                         String Grade) {

        System.out.println("|--------------------------------------------------|");
        System.out.println("|                   Mark Sheet                     |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Name          :                       " + Name + "      |");
        System.out.println("| RollNo        :                       " + RollNo + "         |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Subjects      :                       Marks      |");
        System.out.println("___________________________________________________|");
        System.out.println("| Maths         :                       " + Maths + "         | ");
        System.out.println("| Science       :      a                 " + Science + "         |");
        System.out.println("| English       :                       " + English + "         |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Total         :                       " + Total + "      |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Percentage    :                       " + Percentage + "       |  ");
        System.out.println("| Result        :                       " + Result+ "       |"  );
        System.out.println("| Grade         :                       " + Grade + "         |");
        System.out.println("|__________________________________________________|");


    }
}






