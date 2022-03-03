package day13;

import java.util.function.BinaryOperator;

public class MaxFinderTest {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> m = (n1,n2) -> n1>n2 ? n1:n2;
		System.out.println(m.apply(5, 6));
		
		MaxFinder max4 = (n1,n2) -> n1>n2 ? n1:n2;
		System.out.println(max4.maximum(5, 90));
	

	}

}
