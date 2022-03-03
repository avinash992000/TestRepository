package day5;

class BankDay {
	int interest;
	BankDay(){
		
	}
	
	public void getRateOfInterest(int interest) {
		this.interest = interest;
		System.out.println(interest);
	}
	/*public void displayData() {
		System.out.println("value of j: "+interest);
	}*/

}

class SBI extends BankDay {
	int interest1;
	
	public void getRateOfInterest(int interest) {
		this.interest1 = interest;
		System.out.println(interest1);
	}

}
class ICICI extends BankDay {
	int interest2;
	
	public void getRateOfInterest(int interest2) {
		this.interest2 = interest2;
		System.out.println(interest2);
	}
	
}
class AXIS extends BankDay {
	int interest3;
	
	public void getRateOfInterest(int interest3) {
		this.interest3 = interest3;
		System.out.println(interest3);
	}
	
}

