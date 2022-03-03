package day6;

import java.util.Objects;

public class Equals {
	private int empid;
	private String name;
	private int salary;
	
	Equals(int empid,String name,int salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empid, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals other = (Equals) obj;
		return empid == other.empid && Objects.equals(name, other.name) && salary == other.salary;
	}

}
