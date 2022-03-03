package day3;

public class Nested {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<6;i++) {
			for(int k=0;k<=n;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			n--;
			System.out.println("");
		}

	}

}
