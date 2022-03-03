package day2;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check:-");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		
		sc.close();

	}

}
