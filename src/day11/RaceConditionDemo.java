package day11;

public class RaceConditionDemo {
	int counter = 0;
	public void incrementCounter() {
		synchronized (this) {
			counter++;
			System.out.println("value for"+Thread.currentThread().getName()+"-"+counter);
			
		}
	}
	public int getCounter() {
		return counter;
	}
	public static void main(String[] args) {
		RaceConditionDemo rc = new RaceConditionDemo();
		for(int i = 0;i<10;i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					rc.incrementCounter();
					
				}
			}).start();
		}
	}

}
