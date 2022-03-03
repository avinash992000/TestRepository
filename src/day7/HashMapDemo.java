package day7; 
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> name = new HashMap<>();
		name.put(1, "Avinash");
		name.put(2, "raja");
		name.put(3, "ram");
		name.put(2, "sheekar");
		
		Set<Integer> key = name.keySet();
		Iterator<Integer> itr1 = key.iterator();
		while(itr1.hasNext()) {
			int n = itr1.next();
			System.out.println(n+name.get(n));
		}
		
		
		
		
		Map<String,String> City = new HashMap<>();
		City.put("Rjy", "Rajahmundry");
		City.put("Viz", "VIZAG");
		City.put("Vjy", "Vijaywada");
		City.put("Rjy", "Andhra");
		
		System.out.println(City.get("Rjy"));
		
		Set<String> keys = City.keySet();
		for (String s:keys){
			System.out.println("prints From keyset:"+s+" "+City.get(s));
		}
		
		
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String s2 = itr.next() ;
			System.out.println("prints from iterator:"+s2+" "+City.get(s2));
		}
		Collection<String> values = City.values();
		for(String s:values) {
			System.out.println("prints from Values:"+s);
		}
		
		Set<Entry<String, String>>  entryset = City.entrySet();
		for(Entry<String, String> e: entryset) {
			System.out.println("prints from entryset:"+e.getKey()+" Value:"+e.getValue());
		}

	}

}
