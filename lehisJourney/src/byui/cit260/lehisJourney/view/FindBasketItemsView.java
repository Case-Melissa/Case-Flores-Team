/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.CollectionController;
import byui.cit260.lehisJourney.exceptions.CollectionControllerException;
import byui.cit260.lehisJourney.model.Item;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lehisjourney.LehisJourney;

/**
 *
 * @author Sylvia
 */
public class FindBasketItemsView extends View {

    public FindBasketItemsView() {
        super("\n"
                + "\n--------------------------------"
                + "\n   Collect Items to make your Basket"
                + "\n--------------------------------"
                + "\nG - Get goat hair"
                + "\nC - Get camel hair"
                + "\nS - Get goat skin"
                + "\nK - Get camel skin"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case
        

        switch (selection) {
            case 'G': 
            {
                try {
                    getGoatHair();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'C': 
            {
                try {
                    getCamelHair();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'S': 
            {
                try {
                    getGoatSkin();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'K': 
            {
                try {
                    getCamelSkin();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void FindBasketItemsView() {

        FindBasketItemsView FindBasketItems = new FindBasketItemsView();
        FindBasketItems.display();

    }

    private void getCamelHair() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getCamelHair(LehisJourney.getGame())) {
            System.out.println("You don't have the right item.");
        }
    }
    private void getGoatHair() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getCamelHair(LehisJourney.getGame())) {
            System.out.println("You don't have the right item.");
        }
    }
    private void getGoatSkin() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getCamelHair(LehisJourney.getGame())) {
            System.out.println("You don't have the right item.");
        }
    }
    private void getCamelSkin() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getCamelHair(LehisJourney.getGame())) {
            System.out.println("You don't have the right item.");
        }
    }
}
