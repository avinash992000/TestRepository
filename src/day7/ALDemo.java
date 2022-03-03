package day7;

import java.util.*;

public class ALDemo {

	public static void main(String[] args) {
		List<Integer> numlist = new ArrayList<Integer>();
		//List<Integer> numlist = new LinkedList<>();
		numlist.add(0);
		numlist.add(1);
		numlist.add(3);
		numlist.add(3);
		numlist.add(4);
		numlist.add(5);
		numlist.add(6);
		numlist.add(7);
		
		int search = 3;
		for(int i:numlist) {
			if(i==search) {
				System.out.println(i);
			}
		}
		
		numlist.remove(7);
		numlist.remove(Integer.valueOf(5));
		
		System.out.println(numlist.size());
		System.out.println("enter element to search");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a = 0;
		Iterator<Integer> itr = numlist.iterator();
		while(itr.hasNext()) {
			int n = itr.next();
			if(numlist.indexOf(a++)==m) {
				System.out.println("requested element found at index:"+(a-1)+" value:"+ n);
			}
			
		}
		
		for(Integer i:numlist) {
			System.out.println(i);
		}
		
		
		List<String> strarr = new ArrayList<>();
		strarr.add("Hello");
		strarr.add("World");
		strarr.add(null);
		strarr.add("Hello");
		strarr.add("World");
		strarr.add("java");
		
		
		strarr.add(2,"java");
		strarr.remove("Hello");
		
		System.out.println(strarr.size());
		
		for(String i:strarr) {
			System.out.println(i);
		}

	}

}
