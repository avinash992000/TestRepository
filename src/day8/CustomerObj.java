package day8;

public class CustomerObj {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setName("raja");
		c1.setAddress("Vizag");
		c1.setAge(25);
		c1.setBalance(4567);
		Account a1 = new Account();
		a1.setAccnum(5678);
		a1.setIfscCode("sdyjk");
		c1.l1.add(a1);
		//c1.s1.add("dfghj");
		Account a2 = new Account();
		a2.setAccnum(9876);
		a2.setIfscCode("lkjh");
		c1.l1.add(a2);
		//c1.s1.add("cvhj");
		
		c1.displayCustomerAndAccount();

	}

}
