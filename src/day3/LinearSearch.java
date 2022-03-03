package day3;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int n=0,flag=1;
		while(n<5) {
			if(value==arr[n]) {
				System.out.println("number found");
				flag=0;
				break;
			}
			n++;
		}
		if(flag==1) {
			System.out.println("not found");
		}
		

	}

}
