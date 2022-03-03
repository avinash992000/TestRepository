package day4;

public class Account {
	private String AccountNo;
	private int ifscCode;
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number:"+getAccountNo()+"  Ifsc Code:"+getIfscCode());
	}

}
