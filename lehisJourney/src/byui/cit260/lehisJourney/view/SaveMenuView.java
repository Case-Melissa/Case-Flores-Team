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
        value = value.toUpperCase();
    }

    private void loadSavedGame() {
        System.out.println("Load and Save Game");
    }

    private void deleteSaveGame() {
        System.out.println("Delete Save Game");
    }

    private void saveCurrentGame() {
        System.out.println("Save current Game");
    }

    private void returnToGame() {
        System.out.println("Return to Game");
    }

    private void quitWithoutSaving() {
        System.out.println("Quit the game without saving it");
    }
}
