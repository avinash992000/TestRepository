package day11;

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter ct = new Counter();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				ct.increment();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				ct.decrement();
			}
		};
		t1.start();
		t2.start();

	}

}
