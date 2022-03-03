package day5;

public class ProgrammerDay5 extends EmployeeDay5 {
	private int bonus;
	private float total_salary;
	
	
	
	public int getBonus() {
		return bonus;
	}



	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



	public float getTotal_salary() {
		total_salary = getSalary()+getBonus();
		return total_salary;
	}
	
	public  void displayTotalSalary() {
		System.out.println(getTotal_salary());
	}


}
