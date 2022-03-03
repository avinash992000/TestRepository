package day5;

public class InsuranceDriver {

	public static void main(String[] args) {
		Insurance emp1 = new Insurance();
		emp1.setEmpid(1);
		emp1.setName("Ram");
		emp1.setDesignation("Manager");
		emp1.setSalary(50000);
		emp1.displayinsurance();
		
		
		Insurance emp2 = new Insurance();
		emp2.setEmpid(1);
		emp2.setName("Jay");
		emp2.setDesignation("Programmer");
		emp2.setSalary(30000);
		emp2.displayinsurance();
		
		Insurance emp3 = new Insurance();
		emp3.setEmpid(3);
		emp3.setName("Avinash");
		emp3.setDesignation("System Associate");
		emp3.setSalary(15000);
		emp3.displayinsurance();
		
		Insurance emp4 = new Insurance();
		emp4.setEmpid(4);
		emp4.setName("Veer");
		emp4.setDesignation("Housekeeping");
		emp4.setSalary(3000);
		emp4.displayinsurance();
		
		Insurance emp5 = new Insurance();
		emp5.setEmpid(5);
		emp5.setName("raj");
		emp5.setDesignation(null);
		emp5.setSalary(3);
		emp5.displayinsurance();

	}

}
