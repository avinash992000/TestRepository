package day4;

public class EmployeeDrive {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Rajesh","HR");
		Employee emp2 = new Employee("Avinash","Director");
		
		//System.out.println("id: "+emp1.getId()+"name: "+emp1.getname()+"dept: "+emp1.getdept());
		
		emp1.displayValues();
		emp2.displayValues();

	}

}
