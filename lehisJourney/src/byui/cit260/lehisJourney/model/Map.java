/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

import javax.tools.DocumentationTool.Location;

/**
 *
 * @author Melissa Case
 */
public class Map {
    
    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 6;
    
    private Location[][] matrix;
    
    public Map(){
        matrix = new Location [NUM_ROWS][NUM_COLS];
    }
}
