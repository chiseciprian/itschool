class ArrayIteration{
	public static void main(String[] args) {
		int[] array1=new int[]{1,2,3,4};
		int itterate=3;
		arrayItt(array1,itterate);


	}

	public static void arrayItt(int[] array,int inter){
		for (int i=0;i<array.length ;i+=inter ) {
			System.out.println(array[i]);
		}
	}
}