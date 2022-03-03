package day5;

public class AnimalDay4 {
	private String name;
	private String name1;
	
	AnimalDay4(){
		
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	AnimalDay4(String name,String name1) {
		this.name=name;
		this.name1=name1;
	}
	public void displayanimal() {
		System.out.print("animal name: "+name+"animal name1"+name1);
		
	}

}
