/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;
import byui.cit260.lehisJourney.control.CollectionController;
import byui.cit260.lehisJourney.model.Item;
import java.util.Scanner;
/**
 *
 * @author Sylvia
 */
public class FindBasketItemsView extends View{
    
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
        //CollectionController.findBasketItems(basket, Item.basket);

        switch (selection) {
            case 'G':
                getGoatHair();
                break;
            case 'C':
                getCamelHair();
                break;
            case 'S':
                getGoatSkin();
                break;
            case 'K':
                getCamelSkin();
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

    private void getGoatHair() {
        System.out.println("Get Goat Hair");
    }

    private void getCamelHair() {
        System.out.println("Get Camel Hair");
    }

    private void getGoatSkin() {
        System.out.println("Get Goat Skin");
    }

    private void getCamelSkin() {
       System.out.println("Get Camel Skin");
    }

   
}
   
