/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Sylvia
 */
public class Game implements Serializable {
    // class instance variables
        // class instance variables
    private int noOfCharacters;
    private Time startTime;
    private Time currentTime;
    private Character character;
    private Map map;
    private Tent tent;

    public Game() {
    }

    public int getNoOfCharacters() {
        return noOfCharacters;
    }

    public void setNoOfCharacters(int noOfCharacters) {
        this.noOfCharacters = noOfCharacters;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Time currentTime) {
        this.currentTime = currentTime;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Game{" + "noOfCharacters=" + noOfCharacters + ", startTime=" + startTime + ", currentTime=" + currentTime + ", character=" + character + ", map=" + map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.noOfCharacters;
        hash = 79 * hash + Objects.hashCode(this.startTime);
        hash = 79 * hash + Objects.hashCode(this.currentTime);
        hash = 79 * hash + Objects.hashCode(this.character);
        hash = 79 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (this.noOfCharacters != other.noOfCharacters) {
            return false;
        }
        if (!Objects.equals(this.startTime, other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.currentTime, other.currentTime)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return Objects.equals(this.map, other.map);
    }
        
    

}
