package day12;

import java.util.LinkedList;


class Producer1 implements Runnable{
	
	LinkedList<Integer> list;
	Producer1(LinkedList<Integer> list){
		this.list = list;
	}
	

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				while(list.size() >=1) {
					try {
						list.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Adding to queue- "+Thread.currentThread().getName()+" "+i);
				list.add(i);
				list.notify();
			}
		}
		
	}
	
}

class Consumer1 implements Runnable{
	
	LinkedList<Integer> list;
	Consumer1(LinkedList<Integer> list){
		this.list = list;
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				while(list.size() < 1) {
					try {
						list.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming From queue- "+Thread.currentThread().getName()+" "+list.remove());
				list.notify();
			}
		}
		
	}
	
}



public class ProducerConsumerWithOutWait {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Thread t1 = new Thread(new Producer1(list),"Producer");
		Thread t2 = new Thread(new Consumer1(list),"Consumer");
		t1.start();
		t2.start();

	}

}
