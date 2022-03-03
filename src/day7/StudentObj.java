package day7;

import java.util.*;

public class StudentObj {

	public static void main(String[] args) {
		List<Student> s1 = new ArrayList<>();
		
		List<Student> eligiblelist = new ArrayList<>();
		
		List<Student> noteligiblelist = new ArrayList<>();
		
		Student s2 =new Student();
		s2.setName("Raj");
		s2.setGrade("A");
		s2.setTotal(85);
		s1.add(s2);
		
		Student s3 =new Student();
		s3.setName("aj");
		s3.setGrade("c");
		s3.setTotal(65);
		s1.add(s3);
		
		for(Student i:s1) {
			if(i.getTotal()>80) {
				//System.out.println(i.getName()+" eligible for scholarship");
				eligiblelist.add(i);
			}
			else {
				//System.out.println(i.getName()+" Not eligible for scholarship");
				noteligiblelist.add(i);
			}
			
		}
		for(Student i:eligiblelist) {
			System.out.println(i+" --eligible for scholarship");
		}
		for(Student i:noteligiblelist) {
			System.out.println(i+" --Not eligible for scholarship");
		}

	}

}
