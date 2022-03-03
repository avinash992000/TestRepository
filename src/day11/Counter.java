package day11;

public class Counter {
	
	public synchronized void increment() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"i- "+i);
			try {
				Thread.sleep(3);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void decrement() {
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+"i- "+i);
			}
	}

}
