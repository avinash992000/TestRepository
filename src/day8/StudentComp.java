package day8;

import java.util.*;

public class StudentComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	/*Student s= new Student();

	@Override
	public int compareTo(Student o) {
		if(s.getAge()==o.getAge()) {
			return 0;
		}
		else if(s.getAge() > o.getAge()){
			return 1;
		}
		else return -1;
		
	}*/

}
