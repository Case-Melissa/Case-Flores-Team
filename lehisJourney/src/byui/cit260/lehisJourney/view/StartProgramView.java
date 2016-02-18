/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

/**
 *
 * @author home
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
      
        this.promptMessage = "/nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
     System.out.println(
        "\n***********************************************"
      + "\n*                                             *"
      + "\n* This is the game of Lehi's Journey          *"
      + "\n* In this game you will become one of Lehi's  *"
      + "\n* four sons and go on a journey into the      *"
      + "\n* wilderness, then back to visit Laban and    *"
      + "* finally go back to your father                *"
      + ""
     );
    }
    }    
    
