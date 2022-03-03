package day5;

public class Insurance {
	private int empid;
	private String name;
	private String designation;
	private double salary;
	private String insuranceScheme;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsuranceScheme() {
		if(salary>40000 && designation=="Manager") {
			insuranceScheme="IA";
			return insuranceScheme;
		}
		else if(salary<40000 && salary>20000 && designation=="Programmer") {
			insuranceScheme="IB";
			return insuranceScheme;
		}
		else if(salary<20000 && salary>5000 && designation=="System Associate") {
			insuranceScheme="IC";
			return insuranceScheme;
		}
		else if(salary<5000 && designation=="Housekeeping") {
			insuranceScheme="NA";
			return insuranceScheme;
		}
		
		insuranceScheme="Please enter Salary/disgnation proper to display Insurance Scheme";
		return insuranceScheme;
		
	}
	/*public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}*/
	//@Override
	public void  displayinsurance() {
		System.out.println("empid:"+getEmpid()+" name:"+getName()+" designation:"+getDesignation()+" Salary:"+getSalary()+" insurance:"+getInsuranceScheme());
	}
	
	

}
