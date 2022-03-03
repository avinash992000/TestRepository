package day6;

public class CreditCard extends Payment{
	private int withdraw;
	
	
	CreditCard(String name,String Address,int salary){
		super(name,Address);
		this.salary = salary;
	}
	

	@Override
	void doPayment(double amount) {
		System.out.println("in child claass Credit card: "+ (salary-amount));
		this.salary = (salary-amount);
		displayCusDetails();
		
	}
	

}
