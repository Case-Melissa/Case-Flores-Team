/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.ProgramController;
import byui.cit260.lehisJourney.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class StartProgramView {

    protected final BufferedReader keyboard = LehisJourney.getInFile();
    protected final PrintWriter console = LehisJourney.getOutFile();

    public StartProgramView() {

    }

    public void startProgram() {

        displayBanner();

        String playerName = getPlayerName();

        Player player = ProgramController.createPlayer(playerName);

        LehisJourney.setPlayer(player);

        displayWelcomeMessage(player.getName());

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

//        SaveMenuView saveMenu = new SaveMenuView();
//        saveMenu.displayMenu();
//
//        console.println("Name is " + player.getName());
    }

    public String getPlayerName() {

        boolean isValidName = false;
        String name = "";

        this.console.println("Please enter your name: ");

        while (!isValidName) {
            String input = null;
            try {
                input = keyboard.readLine();
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input");

            }
            if (input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                console.println("Input is invalid - name must be at least 2 characters");
            }
        }
        return name;
    }

    public void displayBanner() {
        String welcome = " ";
        welcome
                = "\n***********************************************"
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
                + "\n* the plates back to your family.             *";

        console.println(welcome);

    }

    public void displayWelcomeMessage(String playerName) {
        this.console.println("============================");
        this.console.println("Welcome " + playerName + ".");
        this.console.println("Have Fun");
        this.console.println("============================");

    }
}
