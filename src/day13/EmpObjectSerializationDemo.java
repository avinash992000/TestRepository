package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmpObjectSerializationDemo {

	public static void main(String[] args) {
		EmpObjectSerializationDemo imp1 = new EmpObjectSerializationDemo();
		imp1.writeData();
		imp1.readData();

	}
	private void writeData() {
		//Scanner sc = new Scanner(System.in);
		
//		//String str = sc.nextLine();
//		Employee db = null;
//		//for(int i=0;i<2;i++) {
//			String str1 = sc.nextLine();
//			int Exp = sc.nextInt();
//			db = new Employee(str1,Exp,12000.56);
//		//}
		Employee db[] = {
				new Employee("sachin",25,12000.56),
				new Employee("rahul",24,1500.56),
				new Employee("hrithik",29,1200.56)
		};
		try(FileOutputStream out = new FileOutputStream("D:emp-obj1.src");
			ObjectOutputStream sout = new ObjectOutputStream(out);){
			
			for(int i=0;i<db.length;i++) {
				sout.writeObject(db[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private void readData() {
		try(FileInputStream in = new FileInputStream("D:emp-obj1.src");
				ObjectInputStream sin = new ObjectInputStream(in);) {
			
			Employee e = (Employee) sin.readObject();
			e.showDetails();
			e = (Employee) sin.readObject();
			e.showDetails();
			e = (Employee) sin.readObject();
			e.showDetails();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException cn) {
			cn.printStackTrace();
		}
	}

}
