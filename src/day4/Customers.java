package day4;

public class Customers {
	private String name;
	private String address;
	private int age;
	private double balance;
	private static int counter=0;
	private Account acc1;
	private String Add;
	Account acc = new Account();
	Address add = new Address();
	
	public void setAdd(String add) {
		Add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayCustomerDetails() {
		counter++;
		System.out.println("name:"+ getName()+ " address:"+getAddress()+" age:"+getAge()+" balance:"+getBalance()+"Account no: "+acc.getAccountNo()+"Address Line1: "+add.getAddressLine1()
			+"Address Line2: "	+add.getAddressLine2()+	"City:"+add.getCity()+"State: "+add.getState()+"pincode: "+add.getPincode()+"counter: "+counter);
	}
	public String editAddress(String newAddress) {
		setAddress(newAddress);
		return "Address is changed";
	}

}
