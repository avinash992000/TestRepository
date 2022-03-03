package day1;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(a);
		System.out.println(b);
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("both are equal");
		}

	}

}
