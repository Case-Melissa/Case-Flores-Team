/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author Sylvia
 */
public class SaveMenuView extends View {

    public SaveMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Save Menu "
                + "\n--------------------------------------"
                + "\nL - Load saved Game"
                + "\nD - Delete a saved Game"
                + "\nS - Save current Game"
                + "\nR - Return to gameplay/main menu"
                + "\nW - Quit game without saving changes"
                + "\nQ - Quit"
                + "\n---------------------------------------");

    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {

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
                 ErrorView.display(this.getClass().getName(),"Invalid option");
                break;
        }
        return false;
    }

    private void loadSavedGame() {
         ErrorView.display(this.getClass().getName(),"Load and Save Game");
    }

    private void deleteSaveGame() {
         ErrorView.display(this.getClass().getName(),"Delete Save Game");
    }

    private void saveCurrentGame() {
    ErrorView.display(this.getClass().getName(),"Save Current Game");
    }

    private void returnToGame() {
        ErrorView.display(this.getClass().getName(),"Return to Game");
    }

    private void quitWithoutSaving() {
         ErrorView.display(this.getClass().getName(),"Quit the game without saving it");
    }
}
