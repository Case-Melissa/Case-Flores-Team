/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sylvia
 */
public class Item implements Serializable {

    //Class instance variable  
    private final String description;
    private final Location coordinates;

    Item(String description) {
        this.description = description;
        coordinates = new Location(0, 0);
    }

    public Item() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return coordinates;
    }
}
