package day6;

public class StringComparision {
	
	public static void main(String[] args) {
		String s1 = "run";
		String s2 = "run";// new String("run");
		String s3 = "gun";
		String s4 = "sun";
		
		System.out.println(s1.compareTo(s2));
		
		if(s1.compareTo(s2) == 0) {
			System.out.println("s1 equal to s2");
		}
		
		System.out.println(s4.compareTo(s3));
	}

}
