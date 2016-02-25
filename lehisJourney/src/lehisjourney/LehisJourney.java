/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisjourney;

import byui.cit260.lehisJourney.model.Character;
import byui.cit260.lehisJourney.model.Design;
import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.model.Item;
import byui.cit260.lehisJourney.model.Map;
import byui.cit260.lehisJourney.model.Player;
import byui.cit260.lehisJourney.model.Tent;
import byui.cit260.lehisJourney.view.StartProgramView;

/**
 *
 * @author home
 */
public class LehisJourney {

    private static Player player;
    private static Game game;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startView = new StartProgramView();
        startView.startProgram();

    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LehisJourney.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        LehisJourney.game = game;
    }

    Item itemOne = new Item();

    Map mapOne = new Map();

    Design basketOne = new Design();

    Tent tentOne = new Tent();
}
