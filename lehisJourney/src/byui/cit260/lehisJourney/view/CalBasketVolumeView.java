/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author Melissa Case
 */
public class CalBasketVolumeView extends View {

    public CalBasketVolumeView() {
        super("\n"
                + "\n-------------------------------"
                + "\n| Calculate Basket Volume Menu"
                + "\n-------------------------------"
                + "\nH - Enter basket height"
                + "\nL - Enter basket length"
                + "\nW - Enter basket width"
                + "\nQ - Quit challenge"
                + "\n-------------------------------");
    }

    @Override
    public void doAction(String value) {

        value = value.toUpperCase();// converts to upper case
    }

    private void calBasketVolume() {
        CalBasketVolumeView calBasketVolume = new CalBasketVolumeView();
        calBasketVolume.display();
    }

}
