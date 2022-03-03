package com.mt.exceptions;

public class InvalidSalaryException extends Exception{
	
	
	InvalidSalaryException(){
		super();
	}
	InvalidSalaryException(String str){
		super(str);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/*@Override
	public String toString() {
		return super.getMessage();
	}
	@Override
	public String getMessage() {
		return "ONE" ;//super.getMessage();
	}*/

}
