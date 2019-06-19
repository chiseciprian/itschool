package ro.itschool.curs3;

public class BMI{
	public double calculateBmi(int height, int weight){
	 double bmiResult=weight/Math.pow(height,2);
	 return bmiResult;
	}
}