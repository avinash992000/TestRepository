package day5;

public class PersonDay5 {
	private int Id;
	private String name;
	
	public PersonDay5(int id,String name) {
		this.Id = id;
		this.name = name;
	}
	PersonDay5(){
		
	}
	void displayPerson() {
		System.out.print("Id: "+Id+"name: "+name+" ");
	}

}
