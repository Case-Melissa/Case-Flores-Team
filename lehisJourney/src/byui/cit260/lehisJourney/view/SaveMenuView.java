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
             
           } while(selection != 'Q');
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
         System.out.println ("Load and Save Game");
    }

    private void deleteSaveGame() {
        System.out.println ("Delete Save Game");
    }

    private void saveCurrentGame() {
        System.out.println ("Save current Game");
    }

    private void returnToGame() {
       System.out.println ("Return to Game");
    }

    private void quitWithoutSaving() {
       System.out.println ("Quit the game without saving it"); 
    }
}
