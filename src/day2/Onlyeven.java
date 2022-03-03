package day2;

import java.util.Scanner;

public class Onlyeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check:-");
		//int num = sc.nextInt();
		
		while(true) {
			int num = sc.nextInt();
			if(num%2==0) {
				System.out.println("thank you");
				break;
			}
			else {
				System.out.println("enter even no");
				continue;
			}
		}
		sc.close();

	}

}
