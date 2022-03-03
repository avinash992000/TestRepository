package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ReadLineCount rd = new ReadLineCount();
		String inp = sc.nextLine();
		String filename = inp+".txt";
		//System.out.println(filename);
		rd.ReadLineMethod(filename);
		

	}
	
	public void ReadLineMethod(String filename) {
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			int count=0;
			while(br.readLine()!=null) {
				count++;
			}
			System.out.println(count);
		}catch(IOException e) {
			System.out.println("Error Occured");
		}
	}

}
