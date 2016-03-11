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
public enum Item implements Serializable {
    //Class instance variable
    OIL(2),
    FLOUR(4),
    CLOTHES(8),
    TENTS(2),
    STAKES(8),
    BERRIES(16),
    HONEY(2),
    WHEAT(5),
    WATER(16),
    UNKNOWN_PLANTS(5),
    GOAT_SKIN(1),
    CAMEL_SKIN(1),
    GOAT_HAIR(1),
    CAMEL_HAIR(1);

    private final int description;
    private final Location coordinates;


    Item(int description) {
        this.description = description;
        coordinates = new Location(0,0);
    }

    public int getDescription() {
        return description;
    }

    /**
     *
     * @return
     */
    public Location getCoordinates() {
        return coordinates;
    }
}
