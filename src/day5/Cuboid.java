package day5;

public class Cuboid extends Shape {
	int height;
	
	Cuboid(int length,int breadth,int height){
		super(length,breadth);
		//this.length = length;
		//this.breadth = breadth;
		this.height = height;
		
	}
	public void displaycuboid() {
		displayshape();
		System.out.println("height: "+height);
	}

}
