package day3;
import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		while((n-2)>0) {
			sum=(n1+n2);
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
			n--;
		}

	}

}
