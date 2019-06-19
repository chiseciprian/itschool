package ro.itschool.curs5;

import java.util.Scanner;

public class BmiAplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bmi bmifunction = new Bmi();

        System.out.println("Weight");
        double weight = scan.nextDouble();

        System.out.println("Height");
        double height = scan.nextDouble();

        System.out.println("Your bmi is " + bmifunction.calculate(height, weight));



    }


}
