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
public enum Item {

    //Class instance variable
    oil,
    flour,
    clothes,
    tents,
    stakes,
    berries,
    honey,
    wheat,
    water,
    unknown_plants,
    goat_skin,
    camel_skin,
    goat_hair,
    camel_hair;

    private final String description;
    private final Location coordinates;
   

    Item(String description) {
        this.description = description;
        coordinates = new Location(0, 0);
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return coordinates;
    }
}
