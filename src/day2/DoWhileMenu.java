package day2;
import java.util.Scanner;

public class DoWhileMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1 for java");
			System.out.println("2 for python");
			System.out.println("3 for c");
			System.out.println("enter the value:-");
			n = sc.nextInt();
			
		}while(n<1 || n>3);
		switch(n) {
			case 1:
				System.out.println("selected java");
				break;
			case 2:
				System.out.println("selected python");
				break;
			case 3:
				System.out.println("selected c");
			
		}
		sc.close();

	}

}
