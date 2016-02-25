/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.ProgramController;
import byui.cit260.lehisJourney.model.Player;
import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class StartProgramView {
    
  public StartProgramView(){
  
  }
    public void StartProgramView(){
        
    displayBanner();
    
    String playerName = getPlayerName();
    
    Player player = ProgramController.createPlayer(playerName);
    
    LehisJourney.setPlayer(player);

    displayWelcomeMessage(player.getName());

    MainMenuView mainMenu = new MainMenuView();
    mainMenu.displayMenu();
    
    SaveMenuView saveMenu = new SaveMenuView();
    saveMenu.displayMenu();
     
    System.out.println("Name is " + player.getName());
    }
      public String getPlayerName(){
          
          boolean isValidName = false;
          String name = "";
          Scanner keyboard =  new Scanner(System.in);
      
        System.out.println("Please enter your name: ");
          
          while(!isValidName){
           String input = keyboard.nextLine();
           
           if(input == null || input.length() >= 2){
               isValidName = true;
               name = input;
          } else{
       System.out.print("Input is invalid - name must be at least 2 characters");
           }
          }
          return name;
          }
      
    public void displayBanner() {
      String welcome = " ";
       welcome =
        "\n***********************************************"
      + "\n*                                             *"
      + "\n* This is the game of Lehi's Journey          *"
      + "\n* In this game you will become one of Lehi's  *"
      + "\n* four sons and go on a journey into the      *"
      + "\n* wilderness, then back to visit Laban and    *"
      + "\n* finally go back to your father.             *"
      + "\n*                                             *"
      + "\n* To start this perilous journey you will     *"
      + "\n* need to gather supplies to pitch a tent in  *"
      + "\n* the wilderness. You must find a good        *"
      + "\n* location to pitch the tent. Along the       *"
      + "\n* journey you will have to hunt for resources *"
      + "\n* and food. Then you will have to complete    *"
      + "\n* laban's challenge. After completing the     *"
      + "\n* challenge you must design a basket to carry *"
      + "\n* the plates back to your family.             *"
     ;
        System.out.println(welcome);
    
    } 
    public void displayWelcomeMessage(String playerName){
        System.out.println("============================");
        System.out.println("Welcome "+ playerName + ".");
        System.out.println("Have Fun");
        System.out.println("============================");
        
}
}

