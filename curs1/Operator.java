class Operator{
	public static void main(String[] args) {
		int result=add(1,2);
		System.out.println(result);

		int result2=substr(1,2);
		System.out.println(result2);

		int result3=mult(1,2);
		System.out.println(result3);

		double result4=divide(4,2);
		System.out.println(result4);

		double result5=rest(3,2);
		System.out.println(result5);

		String result6=impatireCuDeToate(4,2);
		System.out.println(result6);



	}

	public static int add(int termen1, int termen2){
		return termen1 + termen2;
	}

	public static int substr(int termen1, int termen2){
		return termen1 - termen2;
	}

	public static int mult(int termen1, int termen2){
		return termen1 * termen2;
	}

	public static double divide(double termen1,double termen2){
		return termen1 / termen2;
	}

	public static double rest(double termen1,double termen2){
		return termen1 % termen2;
	}

	public static String impatireCuDeToate(double termen1,double termen2){
		return termen1 + " / " + termen2 + " = " + divide(termen1,termen2) + " rest " + rest(termen1,termen2);
	}

}