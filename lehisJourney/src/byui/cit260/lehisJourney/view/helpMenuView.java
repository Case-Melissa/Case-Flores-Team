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
public class helpMenuView extends View{


    public helpMenuView() {
        super("\n"
            + "\n-------------------------------"
            + "\n| Help Menu"
            + "\n-------------------------------"
            + "\n? - Help"
            + "\nK - Shortcut Keys"
            + "\nF - FAQs"
            + "\nH - Hints"
            + "\nQ - Quit"
            + "----------------------------------");
    
    @Override
    public boolean doAction(String value){

        value = value.toUpperCase(); //converts to all upper case
    
    }
    private void helpMenu(){
        helpMenuView helpMenu = new helpMenuView();
        helpMenu.display();
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
}
