package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\test.txt");//
			fos = new FileOutputStream("D:\\test1.txt");
			int a;
			while((a=fis.read()) != -1) {
				fos.write(a);
			}
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
					}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
