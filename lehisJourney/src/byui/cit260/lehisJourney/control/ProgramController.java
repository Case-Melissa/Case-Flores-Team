/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.model.Player;

/**
 *
 * @author home
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName){
   
        if(playerName == null){
        return null;
    }

player p = new Player();
p.setName(playerName);
return p;
    }
}
