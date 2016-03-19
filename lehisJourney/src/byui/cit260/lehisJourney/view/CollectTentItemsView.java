/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;
import byui.cit260.lehisJourney.control.TentController;
import byui.cit260.lehisJourney.model.Item;
import static byui.cit260.lehisJourney.model.Item.tent;
import java.util.Scanner;
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
        TentController.collectTentItems(tent, Item.tent);
        int selection = 0;
        
        switch (selection) {
            case 'O':
                findOil();
                break;
            case 'F':
                makeFlour();
                break;
            case 'C':
                makeClothing();
                break;
            case 'T':
                getTents();
                break;
            case 'S':
                createStakes();
                break;
            case 'Q':
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }

    private void CollectTentItems() {
        CollectTentItemsView CollectTentItems = new CollectTentItemsView();
        CollectTentItems.display();
    }

    private void findOil() {
        System.out.println("Find Oil");
    }

    private void makeFlour() {
        System.out.println("Make Flour");
    }

    private void madeClothing() {
        System.out.println("Make Clothing");
    }

    private void getTents() {
        System.out.println("Get Tents");
    }

    private void createStakes() {
        System.out.println("Create Stakes");
    }

    private void makeClothing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
   


