package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class BasketDriver {

	public static void main(String[] args) {
		List<Basket> list = CreateList();
		
		BasketDriver bd = new BasketDriver();
		
		int n = bd.getBasketWithHighestQuantity(list);
		System.out.println("Highest:"+n);
		
		int m = bd.getBasketWithLowestQuantity(list);
		System.out.println("Lowest:"+m);
		
		int p = bd.getBasketWithTotalQuantity(list);
		System.out.println("Total:"+p);
	}
		
		public int getBasketWithHighestQuantity(List<Basket> list) {
			OptionalInt n = list.stream().mapToInt(b -> b.getQuantity()).max();
			//System.out.println("Highest:"+n.getAsInt());
			return n.getAsInt();
		}
		
		public int getBasketWithLowestQuantity(List<Basket> list) {
			OptionalInt m = list.stream().mapToInt(b -> b.getQuantity()).min();
			//System.out.println("Lowest:"+m.getAsInt());
			return m.getAsInt();
		}

		public int getBasketWithTotalQuantity(List<Basket> list) {
			int total = list.stream().mapToInt(Basket::getQuantity).sum();
			//System.out.println("Total:"+total);
			return total;
		}
		
		
		

	

	private static List<Basket> CreateList() {
		// TODO Auto-generated method stub
		List<Basket> list = new ArrayList<Basket>();
		Basket b1 = new Basket(234567654,76);
		list.add(b1);
		Basket b2 = new Basket(766789,4);
		list.add(b2);
		Basket b3 = new Basket(23454,56);
		list.add(b3);
		Basket b4 = new Basket(67654,96);
		list.add(b4);
		Basket b5 = new Basket(2354,786);
		list.add(b5);
		list.forEach(s -> System.out.println(s.getManufactureNo()));
		list.forEach(s -> System.out.println(s.getQuantity()));
		list.forEach(System.out::println);
		
		return list;
	}

}
