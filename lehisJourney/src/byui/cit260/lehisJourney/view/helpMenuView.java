/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class helpMenuView {
private final String menu = "\n"
          + "\n? - Help"
          + "\nK - Shortcut Keys"
          + "\nF - FAQ's"
          + "\nH - Hints"
          + "\nQ - Exit Menu";
          
          public helpMenuView(){
         
      }
          
       public void  displayMenu(){   
           
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
               case '?':
                   help();
                   break;
               case 'K':
                    shortcutKeys();
                    break;
                case 'F':
                    fAQ();
                    break;
                case 'h':
                    hints();
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
               System.err.println("Invalid inout - please enter a valid character.");
           }else {
               isValid = true;
           }
       }
       return input.toUpperCase();
       }

    private void saveCurrentGame() {
        System.out.println ("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET.");
    }

    private void helpMenu() {
         System.out.println ("CALLED HELP MENU - NOT IMPLEMENTED YET.");
    }

    private void loadSavedGame() {
         System.out.println ("CALLED LOAD SAVED GAME - NOT IMPLEMENTED YET.");
    }

    private void startNewGame() {
         System.out.println ("CALLED START NEW GAME - NOT IMPLEMENTED YET.");
    }

    private void shortcutKeys() {
        System.out.println("Shortcut Keys for gameplay");
    }

    private void help() {
        System.out.println("How to play the game");
    }

    private void fAQ() {
        System.out.println("Frequently Asked Questions");
    }

    private void hints() {
        System.out.println("Hints for solving challenges");
    
          }
    }


