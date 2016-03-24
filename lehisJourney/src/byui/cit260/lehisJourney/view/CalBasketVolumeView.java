/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import byui.cit260.lehisJourney.model.Design;
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
    public boolean doAction(String value) {

        value = value.toUpperCase();// converts to upper case
        return true;
    }

    public int getUserHeight() {
        int height = 0;
        Scanner keyboard = new Scanner(System.in);

        this.console.println("Please enter a height: ");
        String input = keyboard.nextLine();
        try {
            height = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            this.console.println("Please enter a number "
                    + "Try again or enter Q to quit");
        }
        return height;
    }

    public int getUserLength() {
        int height = 0;
        Scanner keyboard = new Scanner(System.in);

        this.console.println("Please enter a length: ");
        String input = keyboard.nextLine();
        try {
            height = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "Please enter a number "
                    + "Try again or enter Q to quit");
        }
        return height;
    }

    public int getUserWidth() {
        int height = 0;
        Scanner keyboard = new Scanner(System.in);

        this.console.println("Please enter a width: ");
        String input = keyboard.nextLine();
        try {
            height = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "Please enter a number "
                    + "Try again or enter Q to quit");
        }
        return height;
    }

    private void calBasketVolume() {
        CalBasketVolumeView calBasketVolume = new CalBasketVolumeView();
        calBasketVolume.display();
    }

    public double getHeight(Design design) {
        double height = design.getHeight();
        return height;
    }

    public double getLength(Design design) {
        double length = design.getBase();
        return length;
    }

    public double getWidth(Design design) {
        double width = design.getWidth();
        return width;
    }
}
