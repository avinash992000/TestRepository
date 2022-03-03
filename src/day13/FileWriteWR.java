package day13;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWR {

	public static void main(String[] args) {
		writeFileContent("D:\\test1.txt");
		writeFileChar("D:\\test.txt");

	}
	private static void writeFileContent(String fileName) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
			bw.write("Writing line");
			bw.newLine();
			bw.write("Writing second");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void writeFileChar(String filename) {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("filename"));
			bos.write("one line".getBytes());
			bos.write("\r\n".getBytes());
			bos.write("second line".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
