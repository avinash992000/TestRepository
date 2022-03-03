package day2;

public class BreakWhile {

	public static void main(String[] args) {
		int n=0;
		
		while(n++<10) {
			if(n>4) {
				break;
			}
			System.out.println(n);
		}

	}

}
