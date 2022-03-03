package day7;
import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1,2);
		list.add(2,3);
		list.add(4);
		list.add(5);
		list.add(5, 6);// can add with index
		list.add(1, 10);
		//list.set(4, 7);// can use set to modify
		
		//Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
