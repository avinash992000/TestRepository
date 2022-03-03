package day7;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("HERE");
		str.append(" we");
		str .append(" in");
		str.append(" java");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		System.out.println(str.length());

	}

}
