package day5;

public class MammalDay4 extends AnimalDay4{
	private String name3;
	
	MammalDay4(String name,String name1,String name3) {
		super(name,name1);
		this.name3=name3;
	}
	MammalDay4(){
		
	}
	public void display() {
		displayanimal();
		System.out.println("animal name3"+name3);
		
	}

}
