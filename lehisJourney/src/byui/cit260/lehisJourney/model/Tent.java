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
 * @author home
 */
public class Tent implements Serializable{
    
    //Class instance variable
    private double items;
    private String description;
    private int coordinates;
    private double occupants;
    private Game game;
    public Tent() {
    }

    public double getItems() {
        return items;
    }

    public void setItems(double items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public double getOccupants() {
        return occupants;
    }

    public void setOccupants(double occupants) {
        this.occupants = occupants;
    }

    @Override
    public String toString() {
        return "Tent{" + "items=" + items + ", description=" + description + ", coordinates=" + coordinates + ", occupants=" + occupants + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.items) ^ (Double.doubleToLongBits(this.items) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.coordinates;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.occupants) ^ (Double.doubleToLongBits(this.occupants) >>> 32));
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
        final Tent other = (Tent) obj;
        if (Double.doubleToLongBits(this.items) != Double.doubleToLongBits(other.items)) {
            return false;
        }
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (Double.doubleToLongBits(this.occupants) != Double.doubleToLongBits(other.occupants)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }
    
    
}
