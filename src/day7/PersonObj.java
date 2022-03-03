package day7;

import java.util.*;

public class PersonObj {

	public static void main(String[] args) {
		Map<Integer , Person> m1 = new HashMap<>();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Avinash");
		p1.setAge(21);
		m1.put(p1.getId(), p1);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("Raja");
		p2.setAge(15);
		m1.put(p2.getId(), p2);
		PersonObj a= new PersonObj() ;
		a.eligible(m1);
		
		
	}
	public void eligible(Map<Integer , Person> m1) {
		List<Integer> eligible = new ArrayList<>();
		List<Integer> noteligible = new ArrayList<>();
		
		
		Set<Integer> key = m1.keySet();
		Iterator<Integer> itr = key.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			//System.out.println(m1.get(i).getAge());
			if(m1.get(i).getAge()>=18) {
				eligible.add(i);
			}
			else {
				noteligible.add(i);
			}
		}
		
		
		
		/*for(int i: m1.keySet()) {  //-->using for loop
			if(m1.get(i).getAge()>=18) {
				eligible.add(i);
			}
			else {
				noteligible.add(i);
			}
			//System.out.println(m1.get(itr.next()));
		}*/
		
		for(int i:eligible) {
			System.out.println(m1.get(i)+" --eligible to vote");
		}
		for(int i:noteligible) {
			System.out.println(m1.get(i)+" --Not eligible to vote");
		}
		
		

	}

}
