package day7;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack();
		st1.push(1);
		st1.push(2);
		st1.push(3);
		st1.push(4);
		st1.push(5);
		
		st1.pop();
		
		System.out.println(st1);

	}

}
