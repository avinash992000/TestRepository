package day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check:-");
		int fac = sc.nextInt();
		int result=1;
		while(fac>0) {
			result*=fac--;
		}
		System.out.println(result);

	}

}
