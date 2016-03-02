/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * TEST and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

/**
 *
 * @author Sylvia
 */
public class HuntingController {

    public double calcLengthHunting(double length, double distance, double height) {

        if (height < 55 || height > 66) { // height is incorrect
            return -1;
        }
        if (distance < 720 || distance > 1080) { // distance is incorrect
            return -1;
        }

        length = Math.sqrt(Math.pow(height, 2) - Math.pow(distance, 2));

        return length;

    }

}
