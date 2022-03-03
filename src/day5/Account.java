package day5;

import java.util.Objects;

public class Account {
	@Override
	public int hashCode() {
		return Objects.hash(accNum);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accNum == other.accNum;
	}
	private long accNum;
	private double balance;
	private double deposit;
	private double withdraw;


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit() {
		setBalance(getBalance()+getDeposit());
		System.out.println("Deposit is sucessful: "+getDeposit());
	}
	public void Withdraw() {
		setBalance(getBalance()-getWithdraw());
		System.out.println("WithDraw Sucessful: "+getWithdraw());
	}
	

}
