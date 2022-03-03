package day9;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			String str = null;
			ThrowDemo throwDemo = new ThrowDemo();
			throwDemo.display(str);
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
	public void display(String str) {
		if(str == null) {
			throw new NullPointerException("String is null");
		}
	}

}
