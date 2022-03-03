package day13;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Oranege");
		
		list.forEach(String -> String.startsWith("m"));
		//System.out.println(list.forEach(String -> String.startsWith("m") ));
		
		
//		list.forEach(String -> {if(String.startsWith("M")) {
//			System.out.println(String);});
//		}

	}

}
