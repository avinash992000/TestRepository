package day6;
import java.util.Scanner;

public class SubString {

	public static String reverse(String str){
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        return st.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String rev = reverse(s1);
        String rev1 = rev;
        int n = s1.length();
        int i =n ;
        while(n>1) {
        	rev1 += rev;
        	n--;
        }
        int a = rev1.length();
        int r = i/2+3;
        if((i/2+3)>a) {
        	r = a;
        }
        System.out.println(rev1.substring(i/2,r));


    }

}
