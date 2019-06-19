jvaimport ro.itschool.curs3.BMI;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BMI mybmi=new BMI();
	

		System.out.println("Inaltimea");
		int height=scan.nextInt();

		System.out.println("Greutate");
		int weight=scan.nextInt();

		System.out.println("Aveti un bmi de " + mybmi.calculateBmi(height,weight));
	}

}