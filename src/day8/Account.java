package day8;

public class Account {
	private int accnum;
	private String ifscCode;
	
	Account(){
		
	}
	Account(int accnum,String ifscCode){
		this.accnum=accnum;
		this.ifscCode=ifscCode;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public void displayAccount() {
		System.out.println("Account no:"+getAccnum()+" ifsc:"+getIfscCode());
	}
	
	public String toString() {
		return "Account no:"+getAccnum()+" ifsc:"+getIfscCode();
	}

}
