package day8;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethodDemo g1 = new GenericMethodDemo();
		Integer[] intArray = {1,2,3,4,5};
		g1.print(intArray);
		
		

	}
	public <T> void print(T[] arr) {
		for(T i:arr) {
			System.out.print(" "+i);
		}
		System.out.println();
	}

}
