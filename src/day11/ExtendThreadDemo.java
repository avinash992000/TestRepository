package day11;

class TThread   extends Thread{
	int i;
	@Override
	public void run() {
		System.out.println("Executed by a thread ="+Thread.currentThread().getName());
		System.out.println(i);
	}
}





public class ExtendThreadDemo{

	public static void main(String[] args){
		System.out.println("in the main method="+Thread.currentThread().getName());
		Thread t1 = new TThread();
		t1.start();
		TThread t2 = new TThread();
		t2.i=1;
		t2.start();
		//new TThread().i = 2;
		//new TThread().start();
		//new TThread().start();

	}

}
