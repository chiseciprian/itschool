class WhileEx{
	public static void main(String[] args) {
		int number=100;
		int index=0;

		while(index<number){
			System.out.println(index++);

			if(index==55){
				break;
			}
		}
	}
}