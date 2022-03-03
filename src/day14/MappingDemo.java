package day14;
import java.util.ArrayList;
import java.util.List;


import day13.Person;
public class MappingDemo {

	public static void main(String[] args) {
		MappingDemo md = new MappingDemo();
		List<Person> emplist = md.createList();
		System.out.println("Females are");
		
		emplist.stream().filter(p -> p.getGender() == 'F').map(p ->p.getFirstname()+" "+p.getLastname()).forEach(System.out::println);
		
		int n = emplist.stream().filter(p -> p.getGender() == 'M').mapToInt(p -> p.getAge() ).sum();
		System.out.println(n);
		
		
		emplist.stream().filter(p -> p.getFirstname().startsWith("A")).forEach(System.out::println);
		emplist.stream().forEachOrdered(System.out::println);
		
		System.out.println(emplist.stream().mapToInt(Person::getAge).sum());
		System.out.println(emplist.stream().mapToInt(p -> p.getAge()).sum());

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
