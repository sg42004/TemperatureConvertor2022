package TemperatureConvertor2022;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to temperature converter!");
        System.out.println("---------------------------------");

        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Taking temperature input from the user
        System.out.print("Enter temperature: ");
        Double temperature = scanner.nextDouble();
        System.out.println(temperature);
        // Taking first unit input
        System.out.print("Enter the unit you want to convert from (Celsius or Fahrenheit): ");
        String unit1 = scanner.next().toLowerCase(Locale.ROOT);
        System.out.println(unit1);
        // Taking second unit input
        System.out.print("Enter the unit to which you want to convert (type Celsius or Fahrenheit): ");
        String unit2 = scanner.next().toLowerCase(Locale.ROOT);
        System.out.println(unit2);

//        System.out.println(temperature);
//        System.out.println(unit1);
//        System.out.println(unit2);


        // Printing result
        double result = tempConvertor(temperature, unit1, unit2);
        System.out.println(result + " ");



    }

    public static double tempConvertor(double temperature, String unit1, String unit2){
        if(unit1.contains("Celsius".toLowerCase(Locale.ROOT)) &&
                unit2.contains("Fahrenheit".toLowerCase(Locale.ROOT))){
            double convertAnswer = temperature * 1.8 + 32;
            return convertAnswer;
        } else if (unit1.contains("Fahrenheit") && unit2.contains("Celsius")){
            return (temperature - 32 / 1.8);
        } else {
            // -1 means error occurred
            return -1;
        }


    }

}
