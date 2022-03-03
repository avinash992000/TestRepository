package day5;

public class SbiDay5 implements BankDay5 {
	public void ROI() {
		System.out.println("Printing from Defined method from SBI");
	}
	
	public static void main(String[] args) {
		BankDay5 B1 = new SbiDay5();
		B1.ROI();
	}

}
