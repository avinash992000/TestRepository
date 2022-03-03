package day12;

/*class newthread extends Thread
{
    Thread t;
    newthread() 
    {
        t = new Thread(this,"My Thread");
        t.start();
    }
    public void run() 
    {
        try 
        {
            t.join();
            System.out.println(t.getName());
        }
        catch(Exception e) 
        {
            System.out.print("Exception");
        }
    }
}
class multithreaded_programing 
{
    public static void main(String args[]) 
    {
        new newthread();
    }
}
class newthread implements Runnable 
{
    Thread t1,t2;
    newthread() 
    {
        t1 = new Thread(this);
        t2 = new Thread(this);
        t1.start();
        t2.start();
    }
    public void run() 
    {
        System.out.print(t1.equals(t2));
    }
}
public class multithreaded_programing 
{
    public static void main(String args[]) 
    {
        new newthread();
    }
}
class multithreaded_programing 
{
    public static void main(String args[])
    {
        int t = Thread.currentThread().getPriority();
        System.out.println(t);        
    }
}
class newthread extends Thread
{
    Thread t;
    newthread() 
    {
        t = new Thread(this,"My Thread");
        t.start();
    }
    public void run() 
    {
        try 
        {
            t.join();
            System.out.println(t.getName());
        }
        catch(Exception e) 
        {
            System.out.print("Exception");
        }
    }
}
class multithreaded_programing 
{
    public static void main(String args[]) 
    {
        new newthread();
    }
}*/
class newthread implements Runnable 
{
    Thread t1,t2;
    newthread() 
    {
        t1 = new Thread(this);
        t2 = new Thread(this);
        t1.start();
        t2.start();
    }
    public void run() 
    {
        System.out.print(t1.equals(t2));
    }
}
public class multithreaded_programing 
{
    public static void main(String args[]) 
    {
        new newthread();
    }
}



