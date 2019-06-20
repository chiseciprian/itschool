package ro.itschool.temacurs4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        HelloIdea printfunction=new HelloIdea();
        printfunction.printHello();


        System.out.println("Please insert a number: ");
        NumberSum numberFunction=new NumberSum();
        int recivedNumber=scan.nextInt();
        System.out.println(numberFunction.calculateNumberSum(recivedNumber));


        System.out.println("Please insert your age: ");
        AgeVerification ageFunction=new AgeVerification();
        int recivedage=scan.nextInt();
        System.out.println(ageFunction.ageVerifed(recivedage));


        RandomNumber randomFunction=new RandomNumber();
        randomFunction.randoomFunction();


        System.out.println("Please insert n and k ");
        int n=scan.nextInt();
        int k=scan.nextInt();
        IntegerRecived integerFunction=new IntegerRecived();
        integerFunction.arayReturn(n,k);

    }
}
