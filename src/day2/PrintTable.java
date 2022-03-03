package day2;

public class PrintTable {

	public static void main(String[] args) {
		int multiple = Integer.parseInt(args[0]);
		
		for(int i=1;i<=10;i++) {
			System.out.println(multiple+" X " + i + " = " + multiple*i);
		}
		System.out.println(" ");
		int i=1;
		while(i<=10) {
			System.out.println(multiple+" X " + i + " = " + multiple*i);
			i++;
		}

	}

}
