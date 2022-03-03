package day5;

public class AccountDriver{

	public static void main(String[] args) {
		//Account acc1 = new Account();
		
		
		CurrentAccount acc1 = new CurrentAccount();
		acc1.setAccNum(12344);
		acc1.setBalance(250000);
		acc1.setDeposit(10000);
		acc1.setWithdraw(15000);
		acc1.Deposit();
		acc1.Withdraw();
		acc1.calculateInterest();
		
		SavingsAccount s1 = new SavingsAccount();
		s1.setAccNum(67899);
		s1.setBalance(1850000);
		s1.setDeposit(25000);
		s1.setWithdraw(200000);
		s1.Deposit();
		s1.Withdraw();
		s1.CalculateInterest();

	}

}
