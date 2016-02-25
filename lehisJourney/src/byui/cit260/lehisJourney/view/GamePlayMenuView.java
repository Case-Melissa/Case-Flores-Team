/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import java.util.Scanner;

/**
 *
 * @author Melissa Case
 */
public class GamePlayMenuView {
  
   private final String menu = "\n"
          + "\nV - View map"
          + "\nI - Look for items at current location"
          + "\nM - Move to a location"
          + "\nS - Special Action"
          + "\nQ - Quit";
   
   public GamePlayMenuView(){
   }   
    public void displayMenu(){   
           
           char selection = ' ';
           
           do{
              System.out.println(menu);
              
             String input = getInput();
             selection = input.charAt(0);
             
             doAction(selection);
             
           } while(selection != 'Q');
}
       public void doAction(char selection){
           
           switch(selection){
               
               case 'V':
                    viewMap();
                    break;
                case 'I':
                    lookForItems();
                    break;
                case 'M':
                    moveToALocation();
                    break;
                case 'S':
                    specialActionMenu();
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid option");
                    break; 
   }
}
public String getInput(){
       Scanner keyboard = new Scanner(System.in);
       String input = null;
       boolean isValid = false;
       
       while(isValid){
           System.out.println("Please select an option: ");
           input =  keyboard.nextLine();
           input = input.trim();
           
           if(input == null || input.length() == 0){
               System.out.println("Invalid input - please enter a valid character.");
           }else {
               isValid = true;
           }
       }
       
       return input.toUpperCase();
    
       }
 private void gamePlayMenu() {
         GamePlayMenuView gamePlayMenu = new GamePlayMenuView();
         gamePlayMenu.displayMenu();
    }
 private void calBasketVolume(){
         CalBasketVolumeView calBasketVolume = new CalBasketVolumeView();
         calBasketVolume.displayMenu();
    }
    private void specialActionMenu() {
       System.out.println ("Open special action menu."); 
    }

    private void moveToALocation() {
        System.out.println ("Move to a new location."); 
    }

    private void lookForItems() {
        System.out.println ("Look for an item in current location."); 
    }

    private void viewMap() {
        System.out.println ("View the map."); 
    }
}