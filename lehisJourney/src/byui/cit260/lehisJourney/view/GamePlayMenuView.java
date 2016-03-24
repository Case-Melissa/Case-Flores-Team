/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.MovementController;
import byui.cit260.lehisJourney.exceptions.MapControlException;
import byui.cit260.lehisJourney.model.Location;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            case 'N': {
                try {
                    moveNorth();
                } catch (MapControlException ex) {
                    Logger.getLogger(GamePlayMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'S': {
                try {
                    moveSouth();
                } catch (MapControlException ex) {
                    Logger.getLogger(GamePlayMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'E': {
                try {
                    moveEast();
                } catch (MapControlException ex) {
                    Logger.getLogger(GamePlayMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'W': {
                try {
                    moveWest();
                } catch (MapControlException ex) {
                    Logger.getLogger(GamePlayMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
                ErrorView.display(this.getClass().getName(),"Invalid option");
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
        this.console.println("Open special action menu.");
    }

    private void moveToALocation() {
        this.console.println("Move to a new location.");
    }

    private void moveNorth() throws MapControlException {
        MovementController mc = new MovementController();
        if (mc.moveNorth(LehisJourney.getGame()) == false) {
            ErrorView.display(this.getClass().getName(), "You cannot move there.");
        }
    }

    private void moveEast() throws MapControlException {
        MovementController mc = new MovementController();
        if (mc.moveEast(LehisJourney.getGame()) == false) {
            ErrorView.display(this.getClass().getName(), "You cannot move there.");
        }
    }

    private void moveSouth() throws MapControlException {
        MovementController mc = new MovementController();
        if (mc.moveSouth(LehisJourney.getGame()) == false) {
            ErrorView.display(this.getClass().getName(), "You cannot move there.");
        }
    }

    private void moveWest() throws MapControlException {
        MovementController mc = new MovementController();
        if (mc.moveWest(LehisJourney.getGame()) == false) {
            ErrorView.display(this.getClass().getName(), "You cannot move there.");
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
        this.console.println("You are at: " + loc.getRow() + ", " + loc.getColumn() + "."
                + "Which is a " + loc.getDescription());
    }

}
