/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;


import byui.cit260.lehisJourney.model.Map;

/**
 *
 * @author Melissa Case
 */
public class MapControl {
    public static Map createMap(){
    Map map = new Map (20,20);
    
    Scene[] scenes = createScenes();

    assignScenesToLocations(map, scenes);
    return map;
    }
    
}
