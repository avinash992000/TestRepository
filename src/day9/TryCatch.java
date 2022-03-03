package day9;
import java.util.*;

public class TryCatch {
	

	public static void main(String[] args) {
		
			UserInput();
	}
	
	
	private static void UserInput(){
		Scanner sc = null;
		sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		divide(n,m);
		try{divide(n,m);}
		catch(ArithmeticException e) {
			System.out.println("error message:"+e.getMessage());
		}
		finally {
			if(sc != null) sc.close();
		}
		
	}
	
	
	private static void divide(int n,int m) {
		int result = n/m;
		System.out.println(result);
	}

}
