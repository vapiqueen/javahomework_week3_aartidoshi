package javahomework_week3_aartidoshi;

import java.util.Scanner;

public class Program5_SalarySlip {
    public static void main(String[] args) {
        Scanner s5=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = s5.nextLine();

        System.out.println("Enter Your EmployeeID");
        int employeeid = s5.nextInt();

        System.out.println("Enter Your Basic Salary:");
        double basicSalary = s5.nextDouble();

       double hRA = calculateHRA(basicSalary);
        double da = calculateDA (basicSalary);
        double ta = calculateTa(basicSalary);
        double pf = calculatePF(basicSalary);

        double grossSalary = basicSalary + hRA +da + ta + pf;

        System.out.println("________________________________________________________");
        System.out.println("|    Salary Slip    |");
        System.out.println("|Employee ID:" + employeeid +" |");
        System.out.println("|Employee Name:" + name+ "  |");
        System.out.println("| _______________________________________________________|");
        System.out.println("|Gross Salary:" + grossSalary + " |");
        System.out.println("|_________________________________________________________|");
        s5.close();
    }

    public static double calculateHRA(double basicSalary){
        return(basicSalary * 10)/100;}
    public static double calculateDA(double basicSalary){
        return (basicSalary * 8) /100;}
    public static double calculateTa(double basicSalary){
        return (basicSalary * 9)/100;}
    public static double calculatePF(double basicSalary){
        return (basicSalary * 20)/100;}

    }

