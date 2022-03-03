package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(7,18,10,24,17,5,10,17,24);
		System.out.println("---Original List---");
		System.out.println(mylist);
		
		List<Integer> newlist = mylist.stream().distinct().collect(Collectors.toList());
		
		System.out.println("--Processed List--");
		
		System.out.println(newlist);
		
		Optional<Integer> opt = mylist.stream().min(Integer::compare);
		if(opt.isPresent()) {
			System.out.println("Minimum Element- "+opt.get());
		}
		List<Integer> newlist1 = mylist.stream().filter((a)->a>10).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(newlist1);
		List<Integer> newlist2 = mylist.stream().filter((a)->a>10).sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(newlist2);
		
		List<String> strlist = Arrays.asList("Ram","Amit","Ashok","Manish");
		strlist.stream().filter(str->!str.startsWith("A")).forEach(S -> System.out.println(S));

	}

}
