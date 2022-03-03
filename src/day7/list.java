package day7;
import java.util.*;

public class list {
	// You are using Java
	
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        List<String> l1 = new ArrayList<>();
	        //Set<String> l1 = new HashSet<String>();
	        //Map<Integer , String> l1 = new TreeMap<>();
	        int i = 0;
	        while(n>0){
	        	i++;
	            //String str = sc.nextLine();
	            //List<String> l1 = new ArrayList<>();
	        	l1.add(sc.next());n--;
	        	
	            //l1.put(i,sc.next());n--;
	        }
	        //Set<String> S1 = new HashSet<String>();
	        //System.out.println(l1.values());
	        System.out.println(l1);
	}

}
