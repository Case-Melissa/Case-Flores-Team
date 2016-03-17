/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.MapControlException;
import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.model.Location;
import byui.cit260.lehisJourney.model.Map;
import byui.cit260.lehisJourney.model.Player;

/**
 *
 * @author Sylvia
 */
public class MovementController {

    public boolean moveNorth(Game game) throws MapControlException {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == 0) {
            throw new MapControlException("Cannot move character to this location "
                                        + location.x + ", " + location.y "because that location is outside "
                                        + "the bounds of the map.");
        }
        

        int currentCol = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;

        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        return true;
    }

    public boolean moveEast(Game game) throws MapControlException {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == map.getCols() - 1) {
            throw new MapControlException("Can not move player to location "
                                         +"because that location is outside"
                                         +"the boudns of the map.");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() + 1));

       return true;
    }
    public boolean moveSouth(Game game) throws MapControlException{

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == map.getRows()- 1) {
            throw new MapControlException("Can not move player to location "
                                         +"because that location is outside"
                                         +"the boudns of the map.");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumn()));

        return true;
    }
    public boolean moveWest(Game game) throws MapControlException{

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == 0) {
            throw new MapControlException("Can not move player to location "
                                         +"because that location is outside"
                                         +"the boudns of the map.");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() - 1));

        return true;
    }
}

   