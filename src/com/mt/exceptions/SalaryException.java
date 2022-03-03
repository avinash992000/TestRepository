package com.mt.exceptions;

public class SalaryException {

	public static void main(String[] args) {
		
		try {
			InvalidSalaryCheck(4000);
		}catch(InvalidSalaryException e) {
			System.out.println(e);
		}

	}
	
	public static void InvalidSalaryCheck(int salary) throws InvalidSalaryException{
		if(salary < 5000) {
			throw new InvalidSalaryException("InvalidSalaryException "+salary);
		}
		else {
			System.out.println("valid salary");
		}
	}

}
