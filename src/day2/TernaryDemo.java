package day2;

public class TernaryDemo {

	public static void main(String[] args) {
		int salary = 5001;
		int increment = (salary>5000)? (salary*10)/100 : (salary*20)/100;
		System.out.println(increment);

	}

}
