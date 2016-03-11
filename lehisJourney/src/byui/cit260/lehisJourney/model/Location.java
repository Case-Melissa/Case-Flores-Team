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
public class Location implements Serializable {

    // class instance variables
    // class instance variables
    private int row;
    private String description;
    private int column;
    private Item item;
    private Map map;
    private Character character;
    private LabansChallengeSceneType labansChallengeSceneType;

    public Location() {
    }

    Location(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public LabansChallengeSceneType getLabansChallengeSceneType() {
        return labansChallengeSceneType;
    }

    public void setLabansChallengeSceneType(LabansChallengeSceneType labansChallengeSceneType) {
        this.labansChallengeSceneType = labansChallengeSceneType;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", description=" + description + ", column=" + column + ", item=" + item + ", map=" + map + ", character=" + character + ", labansChallengeSceneType=" + labansChallengeSceneType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.row);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.column);
        hash = 23 * hash + Objects.hashCode(this.item);
        hash = 23 * hash + Objects.hashCode(this.map);
        hash = 23 * hash + Objects.hashCode(this.character);
        hash = 23 * hash + Objects.hashCode(this.labansChallengeSceneType);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return Objects.equals(this.labansChallengeSceneType, other.labansChallengeSceneType);
    }

}
