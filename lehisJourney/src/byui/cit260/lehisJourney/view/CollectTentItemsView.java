/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;
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
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

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
   


