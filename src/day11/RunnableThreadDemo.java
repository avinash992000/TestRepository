package day11;

class RThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Executing from thread:"+Thread.currentThread().getName());
		for(int i=0;i<2;i++) {
			System.out.println("Executing from thread:"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				Thread.yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}



public class RunnableThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new RThread());
		t1.start();
		//t1.run();
		Thread t2 = new Thread(new RThread(),"Thread  -- 2");
		t2.start();
		Thread t3 = new Thread(new RThread(),"MY Thread - 3");
		t3.setPriority(t3.MIN_PRIORITY);
		t3.start();
		System.out.println(t3.getPriority());
		
		Thread t4 = new Thread(new RThread(),"MY Thread - 4");
		t4.setPriority(t4.MAX_PRIORITY);
		t4.start();
		
		t1.join();

	}

}
