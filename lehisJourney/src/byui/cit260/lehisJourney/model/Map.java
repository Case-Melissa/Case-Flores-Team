/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;


/**
 *
 * @author Melissa Case
 */
public class Map {

    private static final int NUM_ROWS = 6;
    private static final int NUM_COLS = 6;

    private Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void init() {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location l = new Location();
                l.setRow(row);
                l.setColumn(col);
                int itemIndex =(int) (Math.random() * Item.values().length);
                int locationTypeIndex = (int) (Math.random() * LocationType.values().length);
                l.setDescription(LocationType.values()[locationTypeIndex].toString());
                l.setItem(Item.values()[itemIndex]);
                matrix[row][col] = l;
            }
        }
    }

    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }

    public String getMapDisplay() {
        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getDescription().charAt(0) + "  ";
            }
            rtn += "\n";
        }

        return rtn;
    }
    public int getRows() {
        return NUM_ROWS;
    }
     public int getCols() {
        return NUM_COLS;
    }
}
