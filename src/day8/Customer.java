package day8;

import java.util.*;

public class Customer{
	private String name;
	private String Address;
	private int Age;
	private int balance;
	
	Customer(){
		
	}
	
	Customer(String name,String Address,int Age,int balance){
		this.name=name;
		this.Address=Address;
		this.Age=Age;
		this.balance=balance;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void displayCustomerDetails() {
		System.out.println("name:"+getName()+" Address:"+getAddress()+" age:"+getAge()+" balance:"+getBalance());
	}
	public void editAddress(String newAddress) {
		this.Address=newAddress;
		
	}
	List<Account> l1 = new ArrayList<>();
	//Set<String> s1 = new TreeSet<String>();
	//Account a1 = new Account();
	
	
	public void displayCustomerAndAccount() {
		displayCustomerDetails();
		System.out.println(l1);
		//System.out.println(s1);
	}

}
