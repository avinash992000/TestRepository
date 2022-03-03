package day5;

public class ObjectCount {
	private static int counter = 0; 

	public static void main(String[] args) {
		
		ObjectCount o1 = new ObjectCount();
		o1.incrementCount();
		ObjectCount o2 = new ObjectCount();
		o2.incrementCount();
		ObjectCount o3 = new ObjectCount();
		o3.incrementCount();
		ObjectCount o4 = new ObjectCount();
		o4.incrementCount();
		ObjectCount o5 = new ObjectCount();
		o5.incrementCount();
		
		o5.displayCount();
		

	}
	private void incrementCount() {
		System.out.println("in increment count");
		counter++;
	}
	private void displayCount() {
		System.out.println("Number of objects created: "+counter);
	}

}
