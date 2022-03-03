package day7;

public class Student {
	
	private String name;
	private String grade;
	private int total;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Name:"+name+" grade:"+ grade+" total marks:"+total+" ";
	}
	
	

}
