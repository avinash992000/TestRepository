package day1;

public class average{

	public static void main(String[] args) {
		
		average obj=new average();
		double result = obj.ave(1,2,3,4);
		System.out.println(result);
		

	}
	
	public double ave(int a,int b,int c,int d) {
		return (a+b+c+d)/4;
	}

}
