package day12;

/*class MyThread extends Thread
{
	MyThread() 
	{
		System.out.print(" MyThread");
	}
	public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
public class ThreadDemo 
{
	public static void main (String [] args) 
	{
		Thread t = new MyThread() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}
class ThreadTest extends Thread
{ 
    public void run() 
    { 
        for(int i = 0; i < 3; i++) 
        { 
            System.out.println("A"); 
            System.out.println("B"); 
        } 
    } 
} 
class ThreadDemo extends Thread 
{ 
    public void run() 
    { 
        for(int i = 0; i < 3; i++) 
        { 
            System.out.println("C"); 
            System.out.println("D"); 
        } 
    } 
    public static void main(String args[]) 
        { 
        ThreadTest t1 = new ThreadTest(); 
        ThreadDemo t2 = new ThreadDemo(); 
        t1.start(); 
        t2.start(); 
    } 
}*/
class MyThread extends Thread
{
	MyThread() 
	{
		System.out.print(" MyThread");
	}
	public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
public class ThreadDemo 
{
	public static void main (String [] args) 
	{
		Thread t = new MyThread() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}