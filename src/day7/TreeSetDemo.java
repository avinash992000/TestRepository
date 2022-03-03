package day7;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> hs = new TreeSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("G");
		hs.add("H");
		
		for(String i:hs) {
			System.out.println(i);
		}

	}
}

