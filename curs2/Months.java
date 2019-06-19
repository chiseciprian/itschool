class Months{
	public static void main(String[] args) {
		int month=15;

		System.out.println(monthCase(month));

		
		

	}

	public static String monthCase(int monthRecive){
		switch(monthRecive){
			case 1:
				return "ian";
				
			case 2:
				return "feb";
		
			case 3:
				return "mart";
				
			case 4:
				return "apr";
				
			case 5:
				return "mai";
				
			case 6:
				return "iun";
				
			case 7:
				return "iul";
				
			case 8:
				return "aug";
				
			case 9:
				return "sept";
				
			case 10:
				return "oct";
				
			case 11:
				return "nov";
				
			case 12:
				return "dec";
				
			default:
				return "Upsss se pare ca inca nu s-a inventat luna " +monthRecive + " Ne place ca esti creativ :)";

		}
	}
}