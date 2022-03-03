package day1;

public class addition {

	public static void main(String[] args) {
		addition obj =new addition();
		int sum = obj.sum(8, 9);
		System.out.println("sum is " + sum);
		
		int division = obj.division(2,4);
		System.out.println("division is " + division);
		
		obj.subtract(50,25);
		obj.printdefault();

	}
	
	public int sum(int a,int b) {
		int result = a+b;
		return result;
	}
	
	public void subtract(int a,int b) {
		int result=a-b;
		System.out.println("difference is " + result);
	}
	
	public void printdefault() {
		System.out.println("default message ");
	}
	
	public int multiple(int a,int b) {
		int result = a*b;
		return result;
	}
	public int division(int a,int b) {
		int result = a/b;
		return result;
	}

}
