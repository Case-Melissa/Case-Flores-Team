/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.MapControlException;
import byui.cit260.lehisJourney.model.Character;
import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.model.InventoryItem;
import byui.cit260.lehisJourney.model.Location;
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return InventoryItem.createItemList();
               
    }

    private static Character[] createCharacter(Character[] character) {
        return character;
    }
    public static void moveCharacterToStartingLocation(Map map) 
                            throws MapControlException {
        Character[] characters = Character.values();
    
    for (Character character : characters){
        Location coordinates = character.getCoordinates();
        int returnValue = MapControl.moveCharacterToLocation(character, coordinates);
  
    }
    }

    public static void saveCurrentGame(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getSavedGame(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
