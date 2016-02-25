/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.ProgramController;
import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class helpMenuView {
   private final String menu = "\n"
          + "\n? - Help"
          + "\nK - Shortcut Keys"
          + "\nF - FAQs"
          + "\nH - Hints"
          + "\nQ - Quit";
          
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
                    frequentlyAskedQuestions();
                    break;
                case 'H':
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
               System.out.println("Invalid input - please enter a valid character.");
           }else {
               isValid = true;
           }
       }
       return input.toUpperCase();
       }

    private void helpMenu() {
         helpMenuView helpMenu = new helpMenuView();
         helpMenu.displayMenu();
    }

    private void help() {
        System.out.println("Help with game play");
    }

    private void shortcutKeys() {
        System.out.println("Shortcut keys for gameplay");
    }

    private void frequentlyAskedQuestions() {
        System.out.println("Frequently Asked Questions");
    }

    private void hints() {
        System.out.println("Hints for Solving Challenges");
    }
          } 

