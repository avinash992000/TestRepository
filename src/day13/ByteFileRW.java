package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileRW {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\Screenshot.png");
			fos = new FileOutputStream("D:\\Shot.png");
			
//			fis = new FileInputStream("D:\\test.txt");
//			fos = new FileOutputStream("D:\\test1.txt");
			int a;
			while((a=fis.read()) != -1) {
				fos.write(a);
			}
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				fis.close();
			}
			if(fos != null) {
				fos.close();
			}
		}

	}

}
