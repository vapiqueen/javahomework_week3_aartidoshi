package javahomework_week3_aartidoshi;
//8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class Program8_CityName {
    public static void main(String[] args) {
        Scanner s8 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = s8.next().charAt(0);
        Program8_CityName cityName = new Program8_CityName();
        cityName.printCityName(city);
        s8.close();
    }

    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Atlanta");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("California");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Denmark");
        } else if (city == 'E' || city == 'e') {
            System.out.println("El Paso");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Franca");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }
    }

}


