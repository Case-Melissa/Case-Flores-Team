/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

import byui.cit260.lehisJourney.model.Location;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sylvia
 */
public class LabansChallengeSceneType implements Serializable {
    
   // class instance variables
    private String diameter;
    private String height;
    private String base;
    private String volume;
    private Location location;

    public LabansChallengeSceneType() {
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LabansChallengeSceneType{" + "diameter=" + diameter + ", height=" + height + ", base=" + base + ", volume=" + volume + ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.diameter);
        hash = 89 * hash + Objects.hashCode(this.height);
        hash = 89 * hash + Objects.hashCode(this.base);
        hash = 89 * hash + Objects.hashCode(this.volume);
        hash = 89 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LabansChallengeSceneType other = (LabansChallengeSceneType) obj;
        if (!Objects.equals(this.diameter, other.diameter)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.volume, other.volume)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    
}
