class IfCondition{
	public static void main(String[] args) {
		int number=15;
		condition(number);

		switchCondition(number);

	}

	public static void condition(int number){
		boolean check;

		if (number>10) {
			check=true;

			System.out.println("Numarul este mai mare decat 10");
			System.out.println(check);

		}
		else if(number==10){
			check=true;

			System.out.println("Numarul este egal 10");
			System.out.println(check);

		} else{
			check=false;

			System.out.println("Numarul este mai mic decat 10");
			System.out.println(check);

		}
	}

	public static void switchCondition(int number){
		switch(number){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("Insert 1 or 2");
		}
	}
}