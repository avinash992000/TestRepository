package day6;

public class EqualsDriver {

	public static void main(String[] args) {
		Equals e1 = new Equals(1,"Avinash",250000);
		Equals e2 = new Equals(2,"raj",50000);
		Equals e3 = new Equals(2,"raj",50000);
		
		System.out.println(e3.equals(e2));
		System.out.println(e1.equals(e2));

	}

}
