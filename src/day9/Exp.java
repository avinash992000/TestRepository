package day9;


//You are using Java
import java.util.*;

class Exp{
 public static void main(String[] args){
     //Scanner sc = new Scanner(System.in);
     int n =5;
     int m =2;
     Exp e = new Exp();
     e.divide(n,m);
     try{
         e.name();
         
     }catch(NullPointerException p){
         System.out.println(p.getMessage());
     }
     
     
     
 }
 
 public void divide(int n,int m){
     if(m==0){
         System.out.println("Division by zero not allowed!");
     }
     else{
     System.out.println("Result:"+n/m);}
 }
 
 public void name(){
     String name = "Avinash";
     name = null;
     if(name == null){
         throw new NullPointerException("name should not be empty!");
     }
 }
 
}




