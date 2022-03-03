package day2;

public class ObjectArray {

	public static void main(String[] args) {
		/*Employee[] empArray = new Employee[2];
		Employee emp1 = new Employee(1,"Ramesh","HR");
		Employee emp2 = new Employee(2,"suresh","IT");
		empArray[0] = emp1;
		empArray[1] = emp2;*/
		
		
		Employee empArray[]= {new Employee(1," Avinash "," Director\n"),
				new Employee(2," Rajesh "," Technical Person\n"),
				new Employee(3," suresh "," IT")};
		
		for(Employee emp:empArray) {
			System.out.println("Id:"+emp.getEmpid()+" Name:"+emp.getName()+"Dept:"+emp.getDept());
		}

	}

}
