package day8;

public class GenericDemoDriver {

	public static void main(String[] args) {
		GenericDemo<Integer> g1 = new GenericDemo();
		g1.setObj(1);
		g1.display();
		
		GenericDemo<String> g2 = new GenericDemo();
		g2.setObj("generic");
		g2.display();
		
		
		GenericDemo2<Integer,String> G1 = new GenericDemo2();
		G1.setObj1(1);
		G1.setObj2("hello");
		G1.display();
		
		
		

	}

}
