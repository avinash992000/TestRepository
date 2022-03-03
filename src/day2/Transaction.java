package day2;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		String message = (n<=5) ? "ok" : (n<=10) ? "notify": "warning";
		System.out.println(message);
		
		/*if(n<=5) {
			System.out.println("ok");
		}
		else if(n>5 && n<=10){
			System.out.println("notify");
		}
		else {
			System.out.println("warning");
		}*/

	}

}
