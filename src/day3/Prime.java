package day3;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag;
		for(int j=2;j<=n;j++) {
			flag=1;
			for(int i=2;i<j;i++) {
				if(j%i==0) {
					flag = 0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(j+" ");
			}
		}

	}

}
