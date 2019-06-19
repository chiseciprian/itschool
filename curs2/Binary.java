class Binary{
	public static void main(String[] args) {
		int a=10;
		int b=15;

		String result1= Integer.toBinaryString(a|b);
		String result2= Integer.toBinaryString(a&b);
		String result3= Integer.toBinaryString(a^b);
		System.out.println(a);
		System.out.println(b);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}