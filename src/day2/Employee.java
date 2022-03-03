package day2;

public class Employee{
	int empid;
	String name;
	String dept;
	Employee(int empid,String name,String dept){
		this.empid=empid;
		this.name=name;
		this.dept=dept;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	
	
	

	/*public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}*/
	

}
