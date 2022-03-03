package day2;
import java.util.Scanner;
public class ArrayCreation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] newArray = new int[5];
		/*newArray[0] = sc.nextInt();
		newArray[1] = sc.nextInt();
		newArray[2] = sc.nextInt();
		newArray[3] = sc.nextInt();
		newArray[4] = sc.nextInt();*/
		//int[] newArray = {1,2,3,4,5};
		//String[] newArray = {hello,world,arr,strin};
		for(int i=0;i<5;i++) {
			newArray[i]=sc.nextInt();
		}
		System.out.println(newArray.length);
		int i=0;
		while(i<newArray.length) {
			System.out.println(newArray[i++]);
		}

	}

}
