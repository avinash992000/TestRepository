package day11;

class SetRun implements  Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
	
	}
	
}



public class Threads3 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new SetRun(),"t1 thread priority : ");
		Thread t2 = new Thread(new SetRun(),"t2 thread priority : ");
		Thread t3 = new Thread(new SetRun(),"t3 thread priority : ");
		
		System.out.println("t1 thread priority : "+t1.getPriority());
		System.out.println("t2 thread priority : "+t2.getPriority());
		System.out.println("t3 thread priority : "+t3.getPriority());
		
		
		t1.setPriority(2);
		
		t3.setPriority(8);
		
		System.out.println("t1 thread priority : "+t1.getPriority());
		System.out.println("t2 thread priority : "+t2.getPriority());
		System.out.println("t3 thread priority : "+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Currently Executing Thread : "+Thread.currentThread().getName());
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());

	}

}
