package day4;

public class AccountDriver {

	public static void main(String[] args) {
		Account acc1= new Account();
		Customers cust1 = new Customers();
		cust1.setName("Rajesh");
		cust1.setAddress("Vizag");
		cust1.setAge(21);
		cust1.setBalance(250000.00);
		
		
		acc1.setAccountNo("123456788765");
		acc1.setIfscCode(23454);
		
		cust1.displayCustomerDetails();
		acc1.displayAccountDetails();

	}

}
