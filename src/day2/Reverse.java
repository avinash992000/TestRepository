package day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse:-");
		int n = sc.nextInt();
		int m=0;
		while(n>0) {
			int rem=n%10;
			m=m*10+rem;
			n=n/10;
		}
		System.out.println(m);

	}

}
