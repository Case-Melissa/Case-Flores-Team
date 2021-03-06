/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.HuntingController;
import byui.cit260.lehisJourney.model.Location;
import lehisjourney.LehisJourney;

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

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {
            case 'B': {
                lookBerries();
            }
            break;
            case 'H': {
                seekHoney();
            }
            break;
            case 'E': {
                findWheat();
                break;
            }
            case 'W': {
                searchWater();
            }
            break;
            case 'U': {
                lookUnknownPlants();
            }
            break;
            case 'Q':
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid option");
                break;
        }
        return false;
    }

    private void CollectingFoodWater() {
        CollectingFoodWaterView CollectingFoodWater = new CollectingFoodWaterView();
        CollectingFoodWater.display();
    }

    private void lookBerries() {
        HuntingController hc = new HuntingController();
        if (!hc.lookBerries(LehisJourney.getMapOne())) {
            this.console.println("Look for Berries");
        }
    }

    private void seekHoney() {
        HuntingController hc = new HuntingController();
        if (hc.seekHoney(LehisJourney.getMapOne())) {
            this.console.println("Seek for Honey");
        }
    }

    private void findWheat() {
        HuntingController hc = new HuntingController();
        if (hc.findWheat(LehisJourney.getMapOne())) {
            this.console.println("Find some Wheat");
        }
    }

    private void searchWater() {
        HuntingController hc = new HuntingController();
        if (!hc.searchWater(LehisJourney.getMapOne())) {
            this.console.println("Search for Water");
        }
    }

    private void lookUnknownPlants() {
        HuntingController hc = new HuntingController();
        if (!hc.lookUnknownPlants(LehisJourney.getMapOne())) {
            this.console.println("Look for Unknown Plants");
        }
    }

    private void lookForItems() {
        this.console.println("Look for an item in current location.");
    }

    private void viewMap() {
        this.console.println(LehisJourney.getGame().getMap().getMapDisplay());
    }

    private void currentLocation() {
        Location loc = LehisJourney.getGame().getPlayer().getLocation();
        this.console.println("You are at: " + loc.getRow() + ", " + loc.getColumn() + ".");
        this.console.println("Which is a " + loc.getDescription());
    }
}
