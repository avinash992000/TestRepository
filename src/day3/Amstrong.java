package day3;
import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int check=value;
		int sum=0;
		int count=0;
		while(value>0) {
			count++;
			value=value/10;
		}
		value=check;
		while(value>0) {
			int rem = value%10;
			int n=1;
			for(int i=0;i<count;i++) {
				n*=rem;
			}
			sum+=n;
			value=value/10;
		}
		//System.out.println(sum);
		if(check==sum) {
			System.out.println("its an amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
		

	}

}
