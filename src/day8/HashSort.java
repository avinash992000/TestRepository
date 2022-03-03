package day8;
import java.util.*;

public class HashSort {
	
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Avinash");
		m.put(2, "Raja");
		
		TreeSet<String> sortSet = new TreeSet<>(m.values());
		
		System.out.println(sortSet);
	}

}
