package day8;
import java.util.*;


public class StudentList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.setName("Avinash");
		s1.setAge(21);
		s1.setRoll(215);
		list.add(s1);
		
		Student s2 = new Student();
		s2.setName("Raja");
		s2.setAge(31);
		s2.setRoll(56);
		list.add(s2);
		
		
		Collections.sort(list,new StudentComp());
		
		
		System.out.println(list);
		

	}

}

