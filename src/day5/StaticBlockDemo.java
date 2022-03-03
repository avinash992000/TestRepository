package day5;

public class StaticBlockDemo {
	static  final int i;//final means once we assigned cannot modify it
	static  int b;
	
	static {
		System.out.println("in the static block");
		i=5;
		b=i*5;
		System.out.println("Values  "+i+" "+ b);
	}

	public static void main(String[] args) {
		System.out.println("in the main method");

	}

}
