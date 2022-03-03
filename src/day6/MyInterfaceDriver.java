package day6;

public class MyInterfaceDriver implements MyInterface{

	

	@Override
	public int test(int a,int b) {
		return a + b;
		
	}
	public static void main(String[] args) {
		MyInterface int1;
		int1 = new MyInterfaceDriver();
		System.out.println(int1.test(2, 3));
	}

}
