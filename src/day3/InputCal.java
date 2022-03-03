package day3;
import java.util.Scanner;

public class InputCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Operator = sc.nextLine();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		switch(Operator) {
		case "+":
			System.out.println(n1+n2);
			break;
		case "-":
			System.out.println(n1-n2);
			break;
		case "X":
			System.out.println(n1*n2);
			break;
		case "/":
			System.out.println(n1/n2);
			break;
		}

	}

}
