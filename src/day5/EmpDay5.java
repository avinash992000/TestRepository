package day5;

public class EmpDay5 extends PersonDay5 {
	private double Salary;
	
	EmpDay5(int Id,String name,double Salary) {
		super(Id,name);
		this.Salary = Salary;
	}
	public void display() {
		displayPerson();
		System.out.println("salary: "+Salary);
	}

}
