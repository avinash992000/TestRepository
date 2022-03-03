package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MyRunnableClass implements Runnable{
	int i;
	public MyRunnableClass(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+": i--"+i);
			try {
				readFile(i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	private void readFile(int i) {
		try (BufferedReader br = new BufferedReader(new FileReader("D:test"+".txt"))){
			String strLine;
			while((strLine = br.readLine()) != null) {
				System.out.println("Line is--"+i+strLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
		
		
}
	

public class JoinMethodDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new  MyRunnableClass(1),"t1 thread");
		Thread t2 = new Thread(new  MyRunnableClass(2),"t2 thread");
		Thread t3 = new Thread(new  MyRunnableClass(3),"t3 thread");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("t1.Alive: "+t1.isAlive());
		System.out.println("t2.Alive: "+t2.isAlive());
		System.out.println("t2.Alive: "+t2.isAlive());
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			 e.printStackTrace();
		}
		System.out.println("All files are read here");
		System.out.println("t1.Alive: "+t1.isAlive());
		System.out.println("t2.Alive: "+t2.isAlive());
		System.out.println("t2.Alive: "+t2.isAlive());
		System.out.println("start further processing");
		
	}

}
