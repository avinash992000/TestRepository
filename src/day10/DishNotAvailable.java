package day10;

public class DishNotAvailable extends Exception{
	
	public DishNotAvailable() {
		super();
	}
	public DishNotAvailable(String str) {
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
