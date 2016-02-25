/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import java.util.Scanner;

/**
 *
 * @author Sylvia
 */
public class SaveMenuView {
    
    private final String menu = "\n"
          + "\nL - Load saved Game"
          + "\nD - Delete a saved Game"
          + "\nS - Save current Game"
          + "\nR - Return to gameplay/main menu"
          + "\nW - Quit game without saving changes"
          + "\nQ - Quit";
    
    public SaveMenuView(){
        
    }
    public void  displayMenu(){   
           
           char selection = ' ';
           
           do{
              System.out.println(menu);
              
             String input = getInput();
             selection = input.charAt(0);
             
             doAction(selection);
             
           } while(selection != 'R');
}
       public void doAction(char selection){
           
           switch(selection){
               
               case 'L':
                    loadSavedGame();
                    break;
                case 'D':
                    deleteSaveGame();
                    break;
                case 'S':
                    saveCurrentGame();
                    break;
                case 'R':
                    returnToGame();
                    break;
                case 'W':
                    quitWithoutSaving();
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
       
       while(!isValid){
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
       
    private void loadSavedGame() {
         System.out.println ("CALLED LOAD SAVE GAME - NOT IMPLEMENTED YET.");
    }

    private void deleteSaveGame() {
        System.out.println ("CALLED DELETE SAVE GAME - NOT IMPLEMENTED YET.");
    }

    private void saveCurrentGame() {
        System.out.println ("CALLED SAVE CURRENT GAME - NOT IMPLEMENTED YET.");
    }

    private void returnToGame() {
       System.out.println ("CALLED RETURN TO GAME - NOT IMPLEMENTED YET.");
    }

    private void quitWithoutSaving() {
       System.out.println ("CALLED QUIT WITHOUT SAVING THE GAME - NOT IMPLEMENTED YET."); 
    }
}
