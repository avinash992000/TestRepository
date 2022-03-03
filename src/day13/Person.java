package day13;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private char gender;
	public Person(String firstname,String lastname,int age,char gender) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getFirstname()).append(" ");
		sb.append(getLastname()).append(" ");
		sb.append(getAge()).append(" ");
		sb.append(getGender());
		return sb.toString();
		
	}
	

}
