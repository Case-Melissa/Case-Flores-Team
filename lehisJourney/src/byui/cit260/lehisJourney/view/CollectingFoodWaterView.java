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
public class CollectingFoodWaterView extends View {

    public CollectingFoodWaterView() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Collecting Food and Water Menu"
                + "\n--------------------------------"
                + "\nB - Look for Berries"
                + "\nH - Seek for Honey"
                + "\nE - Find some Wheat"
                + "\nW - Search for Water"
                + "\nU - Look for Unknown plants"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // converts all to upper case
    }

    private void CollectingFoodWater() {
        CollectingFoodWaterView CollectingFoodWater = new CollectingFoodWaterView();
        CollectingFoodWater.display();
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
