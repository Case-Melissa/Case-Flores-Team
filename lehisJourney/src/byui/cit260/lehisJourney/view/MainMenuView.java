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

        value = value.toUpperCase(); //convert to all upper case
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
