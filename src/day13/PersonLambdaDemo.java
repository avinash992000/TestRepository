package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonLambdaDemo {

	public static void main(String[] args) {
		List<Person> personList = createList();
		Predicate<Person> allFemales = p -> p.getGender() == 'F';
		Predicate<Person> AGE = p -> p.getAge() >= 18;
		
		List<Person> femaleList = getVerifiedList(personList, allFemales);
		System.out.println("Female Employees- "+femaleList);
		
		List<Person> ageList = getVerifiedList1(personList,AGE);
		System.out.println("Voting Employees- "+ageList);

	}

	private static List<Person> getVerifiedList(List<Person> personList, Predicate<Person> allFemales) {
		List<Person> newList = new ArrayList<Person>();
		
		for(Person person:personList) {
			if(allFemales.test(person)) {
				newList.add(person);
			}
			
		}
		return newList;
	}
	private static List<Person> getVerifiedList1(List<Person> personList,Predicate<Person> age) {
		List<Person> newlist = new ArrayList<Person>();
		for(Person person:personList) {
			if(age.test(person)) {
				newlist.add(person);
			}
		}
		return newlist;
	}

	private static List<Person> createList() {
		List<Person> tempList = new ArrayList<Person>();
		
		Person person = new Person("Ram","Tiwari",50,'F');
		tempList.add(person);
		person = new Person("Ram","Tiwari",50,'M');
		tempList.add(person);
		System.out.println("list elements are:"+tempList);
		tempList.forEach(Person->System.out.println(Person));
		return tempList;
	}

}
