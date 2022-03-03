package day2;

import java.util.Scanner;

public class GetExponent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check:-");
		int exp = sc.nextInt();
		int pow = sc.nextInt();
		int result=1;
		while(pow>0) {
			result*=exp;
			pow--;
		}
		System.out.println(result);

	}

}
