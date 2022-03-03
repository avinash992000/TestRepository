package day5;

public class HondaDay5 extends BikeDay5{
	
	public void run() {
		System.out.println("Printed from Abstract class");
	}

	public static void main(String[] args) {
		BikeDay5 obj = new HondaDay5();
		obj.run();

	}

}
