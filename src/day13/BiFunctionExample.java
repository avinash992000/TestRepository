package day13;
import java.util.function.BiFunction;

public class BiFunctionExample {
	//Arithmetic ar = new Arithmetic();
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi = Arithmetic::add;
		System.out.println(bi.apply(5,6));
		BiFunction<Float, Float, Float> br = Arithmetic::add;
		System.out.println(br.apply(56.78f,66.65f));
		BiFunction<Double, Double, Double> bt = Arithmetic::add;
		System.out.println(bt.apply(56.65,654.76));
	}
	
	
}
