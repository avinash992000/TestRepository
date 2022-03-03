package day4;

public class Employee {
	private static int counter;
	private String name;
	private String dept;
	
	Employee(String name,String dept){
		this.name = name;
		this.dept = dept;
	}
	public String getname() {
		return name;
	}
	public String getdept() {
		return dept;
	}
	public void displayValues() {
		counter++;
		System.out.println("id:"+counter+" name:"+getname()+" dept:"+getdept());
	}

}
