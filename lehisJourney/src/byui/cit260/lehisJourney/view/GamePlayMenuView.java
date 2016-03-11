/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.model.Location;
import java.util.Scanner;
import lehisjourney.LehisJourney;

/**
 *
 * @author Melissa Case
 */
public class GamePlayMenuView extends View {

    public GamePlayMenuView() {
        super("\n"
                + "\nV - View map"
                + "\nV - View current location"
                + "\nI - Look for items at current location"
                + "\nM - Move to a location"
                + "\nS - Special Action"
                + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {

            case 'V':
                viewMap();
                break;
            case 'I':
                lookForItems();
                break;
            case 'M':
                moveToALocation();
                break;
            case 'S':
                specialActionMenu();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void gamePlayMenu() {
        GamePlayMenuView gamePlayMenu = new GamePlayMenuView();
        gamePlayMenu.display();
    }

    private void calBasketVolume() {
        CalBasketVolumeView calBasketVolume = new CalBasketVolumeView();
        calBasketVolume.display();
    }

    private void specialActionMenu() {
        System.out.println("Open special action menu.");
    }

    private void moveToALocation() {
        System.out.println("Move to a new location.");
    }

    private void lookForItems() {
        System.out.println("Look for an item in current location.");
    }

    private void viewMap() {
        System.out.println(LehisJourney.getGame().getMap().getMapDisplay());
    }

    private void currentLocation() {
        Location loc = LehisJourney.getGame().getPlayer().getLocation();
        System.out.println("You are at: " + loc.getRow() + ", " + loc.getColumn() + ".");
        System.out.println("Which is a " + loc.getDescription());
    }
}
