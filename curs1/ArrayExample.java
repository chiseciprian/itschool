class ArrayExample{
	public static void main(String[] args) {
		int[] array1=new int[3];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);


		int[] array2=new int[]{4,5,6};
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);


		int[] array3=new int[]{7,8,9};
		array3[1]=10;
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);		
		

	 	System.out.println("Array length: " + array1.length);
		
	}
}