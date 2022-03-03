package day7;
import java.util.*;

public class Person implements Comparable<Person>{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "id:"+id+"Name:"+name+" age:"+ age+" ";
	}
	
	public void display(Person p1,Person p2) {
		if(p1.getName()==p2.getName()) {
			this.name=name;
			System.out.println(name);
		}
		else {
			this.name = "Null";
			System.out.println(name);
		}
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Float.valueOf(this.age).compareTo(Float.valueOf(o.getAge()));
	}
	
}




