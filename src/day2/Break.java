package day2;

public class Break {

	public static void main(String[] args) {
		for(int i=10;i>0 ;i--) {
			for(int j=10; ;j--) {
				if(j==5) {
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
