package day8;

import java.util.Comparator;

import day7.Person;

class nameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
}