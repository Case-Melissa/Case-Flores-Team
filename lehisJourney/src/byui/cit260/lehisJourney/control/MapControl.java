/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.MapControlException;
import byui.cit260.lehisJourney.model.Location;
import byui.cit260.lehisJourney.model.Map;
import java.awt.Point;
import javafx.scene.Scene;
import lehisjourney.LehisJourney;

/**
 *
 * @author Melissa Case
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(20, 20);
        return map;
    }
    public static void moveCharacterToLocation(Character character, Location location) throws MapControlException {
        Map map = LehisJourney.getMapOne();
        int newRow = location.getRow();
        int newColumn = location.getColumn();

        if (newRow < 0 || newRow >= map.getRows()
                || newColumn < 0 || newColumn >= map.getCols()) {
            throw new MapControlException("Can not move player to location "
                   + location.getRow() + " , " + location.getColumn()
                   + "because that location is outside"
                   + "the bounds of the map.");
        }
    }

    static int moveCharacterToLocation(byui.cit260.lehisJourney.model.Character character, Point coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int moveCharacterToLocation(byui.cit260.lehisJourney.model.Character character, Location coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Scene[] scenes = createScenes();

  // assignScenesToLocations(map, scenes);
  // return map ;

    private Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

