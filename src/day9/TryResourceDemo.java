package day9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceDemo {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"))){
			String str;
			while((str = br.readLine()) != null){
				System.out.println("Line is:"+str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
