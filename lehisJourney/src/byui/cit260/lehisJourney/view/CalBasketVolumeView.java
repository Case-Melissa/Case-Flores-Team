/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author Melissa Case
 */
public class CalBasketVolumeView { 
      
    private final String menu = "\n"
             + "\nH - Enter basket height"
             + "\nL - Enter basket length"
             + "\nW - Enter basket width"
            + "\nQ - Quit challenge";  
 
    public CalBasketVolumeView (){
    }
    

     public void  displayMenu(){   
           
           char selection = ' ';
           
           do{
              System.out.println(menu);
              
             String input = getInput();
             selection = input.charAt(0);
             doAction(selection);
           }while (selection != 'Q');
     }
    public void doAction(char selection){
    
           double value = ItemControl.calcBasketVolume();
           if (value < 6912 || value > 6912){
           System.out.println("I am sorry that is incorrect, please try again.");
           }else {
        System.out.println("A perfect fit!");
        }
     }
     public String getInput(){
       Scanner keyboard = new Scanner(System.in);
       String input = null;
       boolean isValid = false;
       
       while(isValid){
           System.out.println("Please enter a height: ");
           input =  keyboard.nextLine();
           input = input.trim();
           
           if(input == null || input.length() == 0){
               System.out.println("Invalid input - please enter a valid number.");
           }else {
               isValid = true;
           }
       } 
       return input;
     }
     public String getInputOne(){
       Scanner keyboard = new Scanner(System.in);
       String input = null;
       boolean isValid = false;
       
       while(isValid){
           System.out.println("Please enter a length: ");
           input =  keyboard.nextLine();
           input = input.trim();
           
           if(input == null || input.length() == 0){
               System.out.println("Invalid input - please enter a valid number.");
           }else {
               isValid = true;
           }
       }
       return input;
     }
public String getInputTwo(){
       Scanner keyboard = new Scanner(System.in);
       String input = null;
       boolean isValid = false;
       
       while(isValid){
           System.out.println("Please enter a width: ");
           input =  keyboard.nextLine();
           input = input.trim();
           
           if(input == null || input.length() == 0){
               System.out.println("Invalid input - please enter a valid number.");
           }else {
               isValid = true;
           }
       }
       return input;
     }
      
    private void calBasketVolume(){
         CalBasketVolumeView calBasketVolume = new CalBasketVolumeView();
         calBasketVolume.displayMenu();
    }
      
}

