package day13;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("D:\\myfile.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Done");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
