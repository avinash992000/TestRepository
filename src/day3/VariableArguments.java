package day3;

public class VariableArguments {

	public static void main(String[] args) {
		VariableArguments add = new VariableArguments();
		add.sum(3,4);
		add.sum(1,2,3,4,5,6);
		int arr[] = {1,2,3};
		add.sum(arr);
		
	

	}
	public void sum(int ...a) {//variable argument can pass any no of values with "..."
		int result = 0;
		for(int i:a) {
			result+=i;
		}
		System.out.println(result);
	}

}
