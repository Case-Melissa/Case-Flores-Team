/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Game implements Serializable {

    private double totalTime;
    private long noPeople;
    private Item[] item;
    private InventoryItem[] createItemList;
    private Character character;
    private Player player;
    private Map map;
    private InventoryItem[] inventory;

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public long getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(long noPeople) {
        this.noPeople = noPeople;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Game(InventoryItem[] createItemList) {
        this.createItemList = createItemList;
    }

    public InventoryItem[] getCreateItemList() {
        return createItemList;
    }

    public void setCreateItemList(InventoryItem[] createItemList) {
        this.createItemList = createItemList;
    }

}
