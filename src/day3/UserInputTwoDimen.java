package day3;
import java.util.Scanner;

public class UserInputTwoDimen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int coloumn = sc.nextInt();
		int arr[][]= new int[row][coloumn];
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}


	}

}
