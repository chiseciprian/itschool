package ro.itschool.temacurs4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    Random rnd=new Random();
    Scanner scan=new Scanner(System.in);

    public void randoomFunction(){
        int generateNumber=rnd.nextInt(100);
        boolean guess=false;

        while (guess==false){
            System.out.println("Guess the number");
            int inputNumber=scan.nextInt();

            if (inputNumber<generateNumber){
                System.out.println("Sorry, you're too low. Try again");

            } else if(inputNumber>generateNumber){
                System.out.println("Sorry, you're too high. Try again");
            } else if(inputNumber==generateNumber){
                System.out.println("You guessed "+generateNumber+"! Congratulations!");
                guess=true;
            }
        }
    }
}
