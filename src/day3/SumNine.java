package day3;
import java.util.Scanner;

public class SumNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        int num=0;
        int sum = 0;
        int i = 9;
        while(i<check) {
        	num=i;
        	sum=0;
        	while(num>0) {
            	int rem = num%10;
            	sum += rem;
            	num=num/10;
            }
        	if(sum==9) {
        		System.out.println(i);
        	}
        	i++;
            
        }
        
        
	}

}
