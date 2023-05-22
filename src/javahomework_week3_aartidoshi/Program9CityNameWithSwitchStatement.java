package javahomework_week3_aartidoshi;
//9. Same as above program-8 using switch statement.

import java.util.Scanner;

public class Program9CityNameWithSwitchStatement {

    public static void main(String[] args) {

        Scanner s9 = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = s9.next().toUpperCase();

      Program9CityNameWithSwitchStatement CityName = new Program9CityNameWithSwitchStatement();
      CityName.printCityName(city);

        s9.close();
    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Atlanta");
                break;
            case "B":
                System.out.println("Benoni");
                break;
            case "C":
                System.out.println("California");
                break;
            case "D":
                System.out.println("Doha");
                break;
            case "E":
                System.out.println("El Paso");
                break;
            case "F":
                System.out.println("Franca");
                break;
            default:
                System.out.println("The Alphabet you have entered is not between A to F");
        }
    }
}

