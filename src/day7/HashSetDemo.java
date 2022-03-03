package day7;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("A");
		hs.add("B");
		hs.add("E");
		hs.add("F");
		hs.add("G");
		hs.add("H");
		
		/*for(String i:hs) {
			System.out.println(i);
		}
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(hs);

	}

}
