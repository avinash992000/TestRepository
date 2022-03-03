package day12;


import java.util.Scanner;
import java.util.Vector;


class TThread1 extends Thread{
    public static int count =0;
    //@Override
    public void run(){
        AttendancePercentage ap = new AttendancePercentage();
        int n = ap.getn();
        for(int i = 0;i<n/2;i++){
            if(ap.getarr()==100){
                count+=1;
            }
        }
        
    }
    public int getCount(){
        return count;
    }
    
}

class TThread2 extends Thread{
    public static int counter = 0;
    //@Override
    public void run(){
        AttendancePercentage ap = new AttendancePercentage();
        int n = ap.getn();
        for(int i=1;i<n/2;i++){
            if(ap.getarr()==100){
                counter+=1;
            }
        }
    }
    public int getCount(){
        return counter;
    }
    
}


class AttendancePercentage{
    public static int value = 0;
    public static int a = 0;
    static int n = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        if(value==0){
            n = sc1.nextInt();
        }
        AttendancePercentage  ap = new AttendancePercentage();
        ap.Check();
        
    }
    public void Check(){
        
        Thread t1 = new TThread1();
        Thread t2 = new TThread2();
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        TThread1 t3 = new TThread1();
        TThread2 t4 = new TThread2();
        a = t3.getCount();
        a+=t4.getCount();
        System.out.println(a);
        
        
    }
    public int getn(){
        return n;
    }
    public int getarr(){
        int i = sc.nextInt();
        return i;
    }
    
    // TYpe your code here
    
}