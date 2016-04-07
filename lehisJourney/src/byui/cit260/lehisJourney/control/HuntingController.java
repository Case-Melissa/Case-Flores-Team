/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * TEST and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.HuntingControllerException;
import byui.cit260.lehisJourney.model.Map;
import byui.cit260.lehisJourney.view.ErrorView;
import java.io.PrintWriter;

/**
 *
 * @author Sylvia
 */
public class HuntingController {

    public double calcLengthHunting(double length, double distance, double height) throws HuntingControllerException {
        Double number = null;
        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (height < 55 || height > 66) { // height is incorrect

            }
            if (distance < 720 || distance > 1080) { // distance is incorrect

            }
            try {
                length = Math.sqrt(Math.pow(height, 2) - Math.pow(distance, 2));

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number"
                        + "Try again or enter Q to Quit");
            }

        }
        return number;
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean lookBerries(Map mapOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean seekHoney(Map mapOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean findWheat(Map mapOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean searchWater(Map mapOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean lookUnknownPlants(Map mapOne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
