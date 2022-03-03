package day9;

public class NewMultiCatch {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a:"+a);
			int b = 42/a;
			int c[]= {1};
			c[42] = 99;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("problem in operator: "+e);
		}catch(Exception e) {
			System.out.println("generic expresion:"+e);
		}
		System.out.println("after try / catch");

	}

}
