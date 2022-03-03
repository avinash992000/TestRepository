package day4;
import java.util.Scanner;

public class Credit{
    
    
    public static void main(String[] args){
    	creditUser();
    }
    static void creditUser() {
        Scanner sc = new Scanner(System.in);
        int credit = 5000;
        int choice;
        do{
        System.out.println("1. Engine - $3000\n2. Suspension - $1500\n3. Tyre - $500\n4. Music System - $3000\n5. Exit ");
        System.out.println("Your current credit is: $"+credit);
        System.out.println("Enter your choice? ");
        choice = sc.nextInt();
        if(choice==5){
            break;
        }
        switch(choice){
            case 1:
                if(credit>=3000){
                    credit -= 3000; 
                }
                else{
                    System.out.println("Sorry, the item price(3000) exceeds your current credit("+credit+")");
                }
                break;
            case 2:
                if(credit>=1500){
                    credit -= 1500;
                }
                else{
                    System.out.println("Sorry, the item price(1500) exceeds your current credit("+credit+")");
                }
                break;
            case 3:
                if(credit>=500){
                    credit -=500;
                }
                else{
                    System.out.println("Sorry, the item price(500) exceeds your current credit("+credit+")");
                }break;
            case 4:
                if(credit>=3000){
                    credit -= 3000;
                }
                else{
                    System.out.println("Sorry, the item price(3000) exceeds your current credit("+credit+")");
                }
                break;
        }
            
        }while(choice>=1 && choice<=5);
    }
}