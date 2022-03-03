package day12;

/*class One extends Thread
{
    public void run()
    {
        for(int i=0; i<2; i++)
        {
            System.out.print(i);
        }
    }
}
public class Test
{
    public static void main(String args[])
    {
        Test t = new Test();
        t.call(new One());
    }
    public void call(One o)
    {
        o.start();
    }
}
class A implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Test
{
    public static void main(String... args)
    {
        A a = new A();
        Thread t = new Thread(a);
        t.setName("good");
        t.start();
    }
}
class A implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0;i<4;i++)
            {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }
        }
        catch(InterruptedException e){}
    }
}
public class Test
{
    public static void main(String argv[]) throws Exception
    {
        A a = new A();
        Thread t = new Thread(a, "A");
        Thread t1 = new Thread(a, "B");
        t.start();
        t.join();
        t1.start();
    }
}*/
class One extends Thread
{
    public void run()
    {
        for(int i=0; i<2; i++)
        {
            System.out.print(i);
        }
    }
}
public class Test
{
    public static void main(String args[])
    {
        Test t = new Test();
        t.call(new One());
    }
    public void call(One o)
    {
        o.start();
    }
}


