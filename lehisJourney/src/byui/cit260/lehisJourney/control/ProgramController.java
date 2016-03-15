/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.model.InventoryItem;
import byui.cit260.lehisJourney.model.Item;
import byui.cit260.lehisJourney.model.Map;
import byui.cit260.lehisJourney.model.Player;
import lehisjourney.LehisJourney;

/**
 *
 * @author home
 */
public class ProgramController {

    public static Player createPlayer(String playerName) {

        if (playerName == null) {
            return null;
        }

        Player p = new Player();
        p.setName(playerName);
        return p;
    }

    public static void createNewGame(Player player) {
        Game g = new Game();
        LehisJourney.setGame(g);
        g.setPlayer(player);

        g.setMap(new Map());

        player.setLocation(g.getMap().getLocation(0, 0));
        

        LehisJourney.setGame(g);
    }

    private static InventoryItem[] createItemList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Character[] createCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
