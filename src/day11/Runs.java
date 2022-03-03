package day11;


import java.util.Scanner;

class Getruns implements Runnable{
    int total =0;
    
    
    @Override
    public void run(){
        System.out.println("print:"+Thread.currentThread().getName());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        total+=n;
        
    }
    void name(){
        
    }
    
    void Description(){
        
    }
    
}

public class Runs{
    public static void main(String[] args){
        Thread t1 = new Thread(new Getruns(),"Enter runs for over :1");
        Thread t2 = new Thread(new Getruns(),"Enter runs for over :2");
        
        t1.start();
        t2.start();
    }
}


