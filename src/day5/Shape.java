package day5;

public class Shape {
	private int length;
	private int breadth;
	
	Shape(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Shape(){
		
	}
	
	public void displayshape() {
		System.out.println("in parent class shape");
		System.out.println("length: "+length);
		System.out.println("breadth: "+breadth);
	}

}
