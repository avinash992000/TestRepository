package day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class Vender {
	public static void main(String[]args) {
		
		try {
			Vender v = new Vender();
			v.check();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private void check() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("D:index.txt"));
		
		String str;
		while((str=br.readLine()) != null) {
			if(str == "Check") {
				System.out.println("Valid");
			}
			else {
				System.out.println("Not Valid");
			}
		}

		
	}

}
