package day1;

public class Ifdemo {

	public static void main(String[] args) {
		int i=5;
		int j=8;
		
		if(i>5) {
			System.out.println("value greaterthen 5 ");
		}		
		else if(((i >5 ) && (j !=10)) || (j==8)) {
			System.out.println("multiple condition");
		}
		else{
			System.out.println("value less than 5");
		}
	}

}
