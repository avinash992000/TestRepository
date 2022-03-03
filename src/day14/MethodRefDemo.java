package day14;

import java.util.Arrays;

@FunctionalInterface
interface IMyStringFunc<T, R>{
	R StringFunc(T t);
}

public class MethodRefDemo {

	public static void main(String[] args) {
		String[] strNames = new String[] {"Ram","Shyam","john","Suresh"};
		IMyStringFunc<String[],String[]> stringFunc = SortClass::sortName;
		
		String[] sortedNames = stringFunc.StringFunc(strNames);
		for(String name:sortedNames) {
			System.out.println(name);
		}

	}

}
class SortClass{
	static String[] sortName(String[] names) {
		Arrays.sort(names);
		return names;
	}
}
