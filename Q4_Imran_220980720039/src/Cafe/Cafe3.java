package Cafe;

import java.util.Scanner;


public class Cafe3 extends Cafe {
int foodItem=0;
double itemPrice;
    @Override
    void menu() {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for menu ");
        
         foodItem=sc.nextInt();
        if (foodItem == 1) {
            
            System.out.println("For Coeffe");
            
        }
        if (foodItem == 2) {
            
            System.out.println("For Tea");
            
        }
        if (foodItem == 3) {
            
            System.out.println("For soda");
            
        }
        
    }

    @Override
    void order() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 or 2 or 3 for order ");
        int foodItem=sc.nextInt();
       
        
        
        if (foodItem == 1) {
            
            System.out.println("You've ordered a Pizza");
            
        }
        if (foodItem == 2) {
            
            System.out.println("You've ordered Pizza+");
            
        }
        if (foodItem == 3) {
            
            System.out.println("You've ordered a ColdCofeffe");
            
        }
    }

    @Override
    void bill() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter foodItem for billing ");
        int foodItem=sc.nextInt();
        
        
        switch(foodItem){
        case 1:
        foodItem=1;
            System.out.println("itemprice=230");
        break;
        case 2:
        foodItem=2;
        System.out.println("itemprice=55");;
        break;
        case 3:
        foodItem=3;
       System.out.println("itemprice=80");;
        break;
        
        } 
    }
    
}