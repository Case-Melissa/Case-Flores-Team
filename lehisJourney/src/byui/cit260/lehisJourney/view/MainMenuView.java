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
public class MainMenuView {
  
  private final String menu = "\n"
          + "\nN - New Game"
          + "\nL - Load Saved Game"
          + "\n? - Help Menu"
          + "\nS - Save Current Game"
          + "\nQ - Quit";
          
          public MainMenuView(){
         
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
               case 'N':
                   startNewGame();
                   break;
               case 'L':
                    loadSavedGame();
                    break;
                case '?':
                    helpMenu();
                    break;
                case 'S':
                    saveCurrentGame();
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
          }

