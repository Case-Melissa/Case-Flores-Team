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
 * @author Melissa Case
 */
public enum Character implements Serializable {
//Class instance variable
    Nephi("Obedient and faithful son"),
    Sam("Youngest child and follows Nephi"),
    Laman("Oldest child, not always obedient"),
    Lemuel("2nd Oldest child, follows Laman");

    private double lifeLevel;

private final String description;
    
   
  
    private final Location coordinates;

    Character(String description) {
        this.description = description;
        coordinates = new Location(1,1);
    }

    public double getLifeLevel() {
        return lifeLevel;
    } 
    
    public String getDescription() {
        return description;
    }

    public Location getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int i, int i0) {

//To change body of generated methods, choose Tools | Templates.
    }

}
