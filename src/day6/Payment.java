package day6;

public abstract class Payment {
	private String name;
	private String address;
	public static double salary;
	
	Payment(){
		
	}
	public Payment(String name,String address) {
		this.address=address;
		this.name = name;
		//this.salary = salary;
	}
	
	public void displayCusDetails() {
		System.out.println("name:"+name+"Address"+address);
	}
	abstract void doPayment(double amount);

}
