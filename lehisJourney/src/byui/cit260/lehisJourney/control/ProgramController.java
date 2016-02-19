/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.model.Player;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class ProgramController {
    
    public static Player createPlayer(String playerName){
   
        if(playerName == null){
        return null;
    }

Player p = new Player();
p.setName(playerName);
return p;
    }
    public static void createNewGame(Player player){
        Game g = new Game();
        g.SetPlayer(player);
        LehisJourney.setGame(g);
    }
}
