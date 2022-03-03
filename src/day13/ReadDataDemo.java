package day13;


import java.io.FileReader;
import java.io.IOException;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException{
			FileReader isr = new FileReader("D:\\test.txt");
				int i;
				while((i = isr.read()) != -1) {
					System.out.println((char)i);
					}
				isr.close();
			

	}
}
