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
public class Character implements Serializable {
//Class instance variable

    private String name;
    private double lifeLevel;
    private String description;
    private double coordinates;
    private Item item;
    private Player player;
    private Location location;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(double lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", lifeLevel=" + lifeLevel + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.lifeLevel) ^ (Double.doubleToLongBits(this.lifeLevel) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.coordinates) ^ (Double.doubleToLongBits(this.coordinates) >>> 32));
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.lifeLevel) != Double.doubleToLongBits(other.lifeLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinates) != Double.doubleToLongBits(other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    public void setCoordinates(int i, int i0) {

//To change body of generated methods, choose Tools | Templates.
    }

}
