package day4;

public class CustomerDriver {

	public static void main(String[] args) {
		Account acc1= new Account();
		Customers cust1 = new Customers();
		Address add1 = new Address();
		cust1.setName("Avinash");
		cust1.setAddress("rjy");
		cust1.setAge(21);
		cust1.setBalance(250000.00);
		acc1.setAccountNo("2345654");
		add1.setAddressLine1("Rajahmundry");
		add1.setAddressLine2("East godhavari");
		add1.setCity("vizag");
		add1.setState("Andhra pradesh");
		add1.setPincode("533294");
		cust1.setAcc(acc1);
		cust1.setAdd(add1);
		
		cust1.displayCustomerDetails();

		
		
		
		/*Customers cust2 = new Customers();
		Account acc2= new Account();
		cust2.setName("Raj");
		cust2.setAddress("Andhra");
		cust2.setAge(32);
		cust2.setBalance(50000.00);
		acc2.setAccountNo("234");
		cust2.setAcc(acc2);
		//cust2.displayCustomerDetails();
		
		//cust2.editAddress("Guntur");
		//cust2.displayCustomerDetails();*/
		
		
		

	}

}
