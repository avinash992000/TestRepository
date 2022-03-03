package day9;
import java.io.*;

public class BufferThrowDemo {

	public static void main(String[] args) {
		try{
			display();
			}
		catch(IOException e) {
			System.out.println("give proper file "+e.getMessage());
		}

	}
	
	public static void display() throws IOException{
		String str;
		BufferedReader br;
		br =new BufferedReader(new FileReader("F:\\abc.txt"));
		while((str = br.readLine()) != null){
			System.out.println("Line is:"+str);
		}
		br.close();
	}

}
