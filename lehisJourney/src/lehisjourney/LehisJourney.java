/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisjourney;

import byui.cit260.lehisJourney.model.Char;
import byui.cit260.lehisJourney.model.Player;

/**
 *
 * @author home
 */
public class LehisJourney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
          
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        Char charOne = new Char();
        
        charOne.setName("Nephi");
        charOne.setLifeLevel(50);
        charOne.setDescription("In Wilderness");
        charOne.setCoordinates(2,4);
        
        
    }
    
}