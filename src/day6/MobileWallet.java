package day6;

public class MobileWallet extends Payment{
	
	MobileWallet(String name,String Address,double salary){
		super(name,Address);
		this.salary = salary;
	}

	@Override
	void doPayment(double amount) {
		this.salary = (salary-amount);
		System.out.println("in Child class mobilewallet: "+salary);
		displayCusDetails();
		
	}
	

}
