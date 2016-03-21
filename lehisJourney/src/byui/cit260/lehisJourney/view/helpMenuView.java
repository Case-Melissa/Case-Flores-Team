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
public class helpMenuView extends View {

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
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {
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
                 ErrorView.display(this.getClass().getName(),"Invalid option");
                break;
        }
        return false;

    }

    private void helpMenu() {
        helpMenuView helpMenu = new helpMenuView();
        helpMenu.display();
    }

    private void help() {
         ErrorView.display(this.getClass().getName(),"Help with game play");
    }

    private void shortcutKeys() {
         ErrorView.display(this.getClass().getName(),"Shortcut keys for gameplay");
    }

    private void frequentlyAskedQuestions() {
        ErrorView.display(this.getClass().getName(),"Frequently Asked Questions");
    }

    private void hints() {
         ErrorView.display(this.getClass().getName(),"Hints for Solving Challenges");
    }
}
