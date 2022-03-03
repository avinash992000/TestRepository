package day8;
import java.util.*;

import day7.Person;

public class PersonCom {

	public static void main(String[] args) {
		
		
		nameComparator c1 = new nameComparator();
		Set<Person> s1 = new TreeSet<Person>(c1);
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Raja");
		p1.setAge(54);
		s1.add(p1);
		Person p2=new Person();
		p2.setId(2);
		p2.setName("Avinash");
		p2.setAge(33);
		s1.add(p2);
		
		
		
		//Collections.sort(s1,new nameComparator());
		
		System.out.println(s1);

	}

}
