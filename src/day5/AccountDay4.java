package day5;

public class AccountDay4 {
	private long AccountNo;
	private String name;
	private String email;
	private float Amount;
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	
	public void display() {
		System.out.println("AccountNo: "+getAccountNo()+"Name: "+getName()+"Email: "+getEmail()+"Amount: "+getAmount());
	}

}
