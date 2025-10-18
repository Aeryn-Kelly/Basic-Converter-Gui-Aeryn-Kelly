import java.util.Scanner;

public class Converter {

    static Scanner input = new Scanner(System.in);

    static void FtoC() {

        double fahrenheit = input.nextDouble();
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

        System.out.println(celsius);


    }

    static void CtoF() {

        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(fahrenheit);

    }
}

//This file holds the conversion equations with a basic scanner test to know if they can work