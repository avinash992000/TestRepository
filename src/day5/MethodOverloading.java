package day5;

public class MethodOverloading {
	
	public void sum(int a,int b) {
		int result = a+b;
		System.out.println("sum is"+result);
	}
	public void sum(int a,int b,int c) {
		int result = a+b+c;
		System.out.println("sum is"+result);
	}
	public void sum(int a,int b,int c,int d) {
		int result = a+b+c+d;
		System.out.println("sum is"+result);
	}
	public void overloadedMethod(int i,double d) {
		double result = i+d;
		System.out.println("sum is"+result);
	}
	public void overloadedMethod(int i,String d) {
		System.out.println(d+" "+i);
	}

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.sum(6, 4);
		m1.sum(1, 2, 3);
		m1.sum(1, 2, 8, 7);
		m1.overloadedMethod(3, 54567.78);
		m1.overloadedMethod(654, "ram");
		

	}

}
