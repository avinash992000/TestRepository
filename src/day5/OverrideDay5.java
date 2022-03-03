package day5;

public class OverrideDay5 {

	public static void main(String[] args) {
		BankDay Obj = new SBI();
		Obj.getRateOfInterest(10);
		Obj = new ICICI();
		Obj.getRateOfInterest(40);
		Obj = new AXIS();
		Obj.getRateOfInterest(23);
		

	}

}
