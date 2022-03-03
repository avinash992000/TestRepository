package day6;

public class CreditCard1 implements Payment1{
	private String name;
	private String Address;
	
	CreditCard1(String name,String Address){
		this.name=name;
		this.Address =Address;
	}
	
	@Override
	public void dopayment(double amount) {
		System.out.println("name: "+name+"Address"+Address);
		System.out.println(amount);
		
	}
	
	public static void main(String[] args) {
		Payment1 Pay1;
		Pay1 = new CreditCard1("Avinash", "Andhra");
		Pay1.dopayment(2500);
		Pay1 = new Wallet1("Avinash", "Andhra");
		Pay1.dopayment(500);

	}
	
	


	

}
