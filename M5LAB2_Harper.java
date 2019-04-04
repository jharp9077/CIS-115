/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5lab2_harper;

/**
 *
 * @author harperj5749
 */
import java.util.Scanner;
public class M5LAB2_Harper {
    public static void doubleNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a integer.");
        int firstNumber = reader.nextInt();
        System.out.println("Double the number you entered is " + firstNumber * 2);
        
    }
    public static void tax() {
        System.out.println("enter a decimal number and I'll find what 10% of that number is");
        Scanner reader = new Scanner(System.in);
        
        double firstNumber = reader.nextDouble();
        System.out.println("10% of the entered value is " + firstNumber * .10);
    
    }
    public static void grossPay() {
        System.out.println("To find your weekly gross pay please enter your hourly wage");
        Scanner reader = new Scanner(System.in);
        double hourlyWage = reader.nextDouble();
        System.out.println("Now enter how many hours you work in a week");
        int weeklyHours = reader.nextInt();
        System.out.println("Your total weekly gross income is " + hourlyWage * weeklyHours + "$");
        
    }
    
    public static void exitProgram(){
        System.out.println("Thanks for usuing Jharp's Product!");
        System.exit(0);
        
    }

    public static void showMenu() {
      System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
      System.out.println("      Welcome!");
      System.out.println(" 2) Double a number");
      System.out.println(" 3) Take 10%");
      System.out.println(" 4) Gross Pay");
      System.out.println(" 5) Exit Program");
      System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
      	
      Scanner number = new Scanner(System.in);
      
    }
    public static void main(String[] args) {
        // This program Greats user
        // Asks user for an (INT) number 
        // then complte a series of calculations
        showMenu();
        System.out.println("Please choose a option");
        
        
        Scanner keyboard = new Scanner(System.in);
        int menuChoice = keyboard.nextInt();
        
        
        if (menuChoice ==2) {
            doubleNumber();
        }
        else if (menuChoice ==3){
            tax();
        }
        else if (menuChoice ==4){
            grossPay();
        }
        else if (menuChoice ==5){
            exitProgram();
        }
        
            
            
            
            
          
        
    }
    
}
