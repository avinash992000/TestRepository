package day1;

public class SeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0,k=0,a=1;
		//int[] arr = new int[10001];
		for(int i=1;i<=10000;i=i+n) {
			n++;
//			arr[k++] = i;
			System.out.println(a);
			a+=i;
			
			//for(int j=1;j<=10000;j++) {
				//System.out.println(j+i);
			//}
			
		}
		
//		for(int i=0;i<=10000;i=i+arr[k]) {
//			System.out.println(i+arr[k++]);
//		}
//		for(int i=0;i<=10000;i++) {
//			System.out.println(arr[i]);
//		}
		

	}

}
