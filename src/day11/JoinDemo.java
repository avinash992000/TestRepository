package day11;

class Run1 implements Runnable{
	int i;
	public Run1(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

public class JoinDemo {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Run1(1),"1 Thread");
		t1.start();
		Thread t2 = new Thread(new Run1(2),"2 Thread");
		t2.start();
		System.out.println(t1.isAlive());
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("DONE");
		System.out.println(t1.isAlive());
	}
	
	

}
