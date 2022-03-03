package day3;


public class TwodimensionalArray {

	public static void main(String[] args) {
		int arr[][]= new int[3][3];
		//int arr[][]={{1,1,1},{1,1,1},{1,1,1}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<=2;j++) {
				arr[i][j]=1;
				//System.out.println(arr[i][j]);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//arr[i][j]=j;
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

	}

}
