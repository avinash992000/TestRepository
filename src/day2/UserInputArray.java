package day2;
import java.util.Scanner;
public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int[] Arr = new int[sc.nextInt()];
		
		int i=0;
		while(i<Arr.length) {
			System.out.println("enter element - "+ i );
			Arr[i++]=sc.nextInt();
		}
		i=0;
		while(i<Arr.length) {
			System.out.println(Arr[i++]);
		}

	}

}
