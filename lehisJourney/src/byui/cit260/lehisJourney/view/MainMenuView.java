/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.GameControl;
import byui.cit260.lehisJourney.control.ProgramController;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n| Main Menu"
                + "\n----------------------------------"
                + "\nN - New Game"
                + "\n? - Help Menu"
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {
            case 'N':
                this.startNewGame();
                break;
            case '?':
                this.helpMenu();
                break;
            case 'Q':
                return true;
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

    private void startNewGame() {
        ProgramController.createNewGame(LehisJourney.getPlayer());

//        System.out.println("CALLED START NEW GAME - NOT IMPLEMENTED YET.");
        GamePlayMenuView gpm = new GamePlayMenuView();
        gpm.display();
    }
     
}
