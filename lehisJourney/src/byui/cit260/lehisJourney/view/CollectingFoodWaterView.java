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
public class CollectingFoodWaterView {

    private final String menu = "\n"
            + "\nB - Look for Berries"
            + "\nH - Seek for Honey"
            + "\nE - Find some Wheat"
            + "\nW - Search for Water"
            + "\nU - Look for Unknown plants"
            + "\nQ - Quit";

    public CollectingFoodWaterView() {

    }

    public void displayMenu() {

        char selection = ' ';

        do {
            System.out.println(menu);

//             String input = getInput();
//            selection = input.charAt(0);
            doAction(selection);

        } while (selection != 'Q');
    }

    public void doAction(char selection) {

        switch (selection) {
            case 'B':
                lookBerries();
                break;
            case 'H':
                seekHoney();
                break;
            case 'E':
                findWheat();
                break;
            case 'W':
                searchWater();
                break;
            case 'U':
                lookUnknownPlants();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Please enter a height: ");
            input = keyboard.nextLine();
            input = input.trim();

            if (input == null || input.length() == 0) {
                System.out.println("Invalid input - please enter a valid number.");
            } else {
                isValid = true;
            }
        }

        return input;

    }

    public String getInputFirst() {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Please enter a distance: ");
            input = keyboard.nextLine();
            input = input.trim();

            if (input == null || input.length() == 0) {
                System.out.println("Invalid input - please enter a valid number.");
            } else {
                isValid = true;
            }
        }

        return input;

    }

    private void CollectingFoodWater() {
        CollectingFoodWaterView CollectingFoodWater = new CollectingFoodWaterView();
        CollectingFoodWater.displayMenu();
    }

    private void lookBerries() {
        System.out.println("Look for Berries");
    }

    private void seekHoney() {
        System.out.println("Seek for Honey");
    }

    private void findWheat() {
        System.out.println("Find some Wheat");
    }

    private void searchWater() {
        System.out.println("Search for Water");
    }

    private void lookUnknownPlants() {
        System.out.println("Look for Unknown Plants");
    }

}
