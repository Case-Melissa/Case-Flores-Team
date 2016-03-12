/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.MovementController;
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
                + "\nC - View current location"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
                + "\nI - Look for items at current location"
                + "\nO - Move to a location"
                + "\nA - Special Action"
                + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {

            case 'V':
                viewMap();
                break;
            case 'C':
                currentLocation();
                break;
            case 'N':
                moveNorth();
                break;
            case 'S':
                moveSouth();
                break;
            case 'E':
                moveEast();
                break;
            case 'W':
                moveWest();
                break;
            case 'I':
                lookForItems();
                break;
            case 'M':
                moveToALocation();
                break;
            case 'A':
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

    private void moveNorth() {
        MovementController mc = new MovementController();
        if(!mc.moveNorth(LehisJourney.getGame())) {
            System.out.println("You cannot move there.");
        }
    }

    private void moveEast() {
        MovementController mc = new MovementController();
        if(mc.moveEast(LehisJourney.getGame()) == false) {
            System.out.println("You cannot move there.");
        }
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        if(mc.moveSouth(LehisJourney.getGame()) == false) {
            System.out.println("You cannot move there.");
        }
    }

    private void moveWest() {
        MovementController mc = new MovementController();
        if(mc.moveWest(LehisJourney.getGame()) == false) {
            System.out.println("You cannot move there.");
        }
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
