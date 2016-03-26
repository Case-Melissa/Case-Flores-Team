/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.CollectionController;
import byui.cit260.lehisJourney.exceptions.CollectionControllerException;
import byui.cit260.lehisJourney.model.InventoryItem;
import byui.cit260.lehisJourney.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import lehisjourney.LehisJourney;
import static lehisjourney.LehisJourney.getLogFile;

/**
 *
 * @author Sylvia
 */
public class FindBasketItemsView extends View {

    private static String getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FindBasketItemsView() {
        super("\n"
                + "\n--------------------------------"
                + "\n   Collect Items to make your Basket"
                + "\n--------------------------------"
                + "\nG - Get goat hair"
                + "\nC - Get camel hair"
                + "\nS - Get goat skin"
                + "\nK - Get camel skin"
                + "\nP - Print Basket Items Report"
                + "\nQ - Quit"
                + "\n--------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {
            case 'G': {
                try {
                    getGoatHair();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'C': {
                try {
                    getCamelHair();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'S': {
                try {
                    getGoatSkin();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'K': {
                try {
                    getCamelSkin();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'P': {
                try {
                getPrintReport();
                } catch (CollectionControllerException ex) {
                    Logger.getLogger(FindBasketItemsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid option");
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
            ErrorView.display(this.getClass().getName(), "You don't have the right item to make the basket.");
        }
    }

    private void getGoatHair() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getGoatHair(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have the right item to make the basket.");
        }
    }

    private void getGoatSkin() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getGoatSkin(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have the right item to make the basket.");
        }
    }

    private void getCamelSkin() throws CollectionControllerException {
        CollectionController cc = new CollectionController();
        if (!cc.getCamelSkin(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You don't have the right item to make the basket.");
        }
    }

    private void getPrintReport() throws CollectionControllerException{
        CollectionController cc = new CollectionController();
        if (!cc.getPrintReport(LehisJourney.getGame())) {
            ErrorView.display(this.getClass().getName(), "You can't print your report right now.");
            
        }
        else{
            printBasketItemsReport(FindBasketItemsView.getLogFile());
        }
    }
    public void printBasketItemsReport (String outputLocation) {
        
        InventoryItem[] inventory = InventoryItem.createItemList();
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\n             List of Basket Items Report                   ");
            out.printf("%n%-20s%10s%10s", "Description", "Required", "In Stock");
            out.printf("%n%-20s%10s%10s", "----------------","------------","------------");

        for (InventoryItem item : inventory) {
            out.printf("%n%-20s%7d%7d", item.getDescription()
				      , item.getRequiredAmount()
                                      , item.getQuantityPrintInStock());
        }
            } catch (IOException ex) {
                System.out.println ("I/O Error: " + ex.getMessage());
        }
    }

}
