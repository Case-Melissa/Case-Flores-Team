/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.CollectionController;
import byui.cit260.lehisJourney.control.TentController;
import byui.cit260.lehisJourney.exceptions.CollectionControllerException;
import byui.cit260.lehisJourney.model.InventoryItem;
import byui.cit260.lehisJourney.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import lehisjourney.LehisJourney;

/**
 *
 * @author AllenMac
 */
public class CollectTentItemsView extends View {

    /**
     *
     */
    public CollectTentItemsView() {
        super("\n"
                + "\n--------------------------------"
                + "\n   Collect Items For Your Tent"
                + "\n--------------------------------"
                + "\nO - Find Oil"
                + "\nF - Make Flour"
                + "\nC - Make Clothing"
                + "\nT - Get Tents"
                + "\nS - Create Stakes"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        Item item = null;

        int returnItem = TentController.collectTentItems(item); //convert to all upper case

        int selection = 0;

        switch (selection) {
            case 'O': {
                try {
                    findOil();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(CollectTentItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'F': {
                try {
                    makeFlour();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(CollectTentItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'C': {
                try {
                    makeClothing();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(CollectTentItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'T': {
                try {
                    getTents();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(CollectTentItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'S': {
                try {
                    createStakes();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(CollectTentItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid option");
                break;
        }
        return false;

    }

    private void CollectTentItems() {
        
        CollectTentItemsView CollectTentItems = new CollectTentItemsView();
        CollectTentItems.display();
    }

    private void findOil() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.findOil(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have enough oil.");
        }
    }

    private void makeFlour() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.makeFlour(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have enough flor");
        }
    }

    private void makeClothing() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.makeClothing(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have enough clothing.");
        }
    }

    private void getTents() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getTents(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have enough tents.");
        }
    }

    private void createStakes() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.createStakes(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have enough stakes.");
        } else {
            printTentItemsReport();
        }
    }

    private void printTentItemsReport() {
        InventoryItem[] inventory = InventoryItem.createItemList();
        String outputLocation = "C:/report.txt";

        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\n             List of Tent Items Report                   ");
            out.printf("%n%-20s%10s%10s", "Description", "Required", "In Stock");
            out.printf("%n%-20s%10s%10s", "----------------", "------------", "------------");

            for (InventoryItem item : inventory) {
                out.printf("%n%-20s%7d%7d", item.getDescription(), item.getRequiredAmount(), item.getQuantityPrintInStock());
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
            System.out.flush();
        }
    }
}
