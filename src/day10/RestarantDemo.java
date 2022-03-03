package day10;

public class RestarantDemo {
	
	public void order(String dish) throws DishNotAvailable{
		double n = Math.random();
		if(n>0.5) {
			System.out.println(dish+"Found");
		}
		else {
			throw new DishNotAvailable("NOT FOUND");
		}
	}
	public static void main(String[] args){
		try {
			RestarantDemo rd = new RestarantDemo();
			rd.order("Masala Dosa");
		}catch(DishNotAvailable e) {
			e.printStackTrace();
		}finally {
			System.out.println("Bye");
		}
	}

}
