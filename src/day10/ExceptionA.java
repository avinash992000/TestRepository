package day10;

public class ExceptionA extends Exception{
	
	ExceptionA(){
		super();
	}
	ExceptionA(String str){
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
	
	

}
class ExceptionB extends ExceptionA {
	ExceptionB(){
		super();
	}
	ExceptionB(String str){
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
	
}
class ExceptionC extends ExceptionB{
	ExceptionC(){
		super();
	}
	ExceptionC(String str){
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
}