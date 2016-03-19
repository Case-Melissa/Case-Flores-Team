/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisjourney;

import byui.cit260.lehisJourney.model.Design;
import byui.cit260.lehisJourney.model.Game;
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
    private static Map mapOne = new Map();
    private static Design basketOne = new Design();
    private static Tent tentOne = new Tent();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startView = new StartProgramView();
        try{
        startView.startProgram();
        }
        catch (Throwable te) {
           System.out.println(te.getMessage());
                   te.printStackTrace();
                           startView.displayBanner();
        }
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

    public static Game getCurrentGame() {
        return game;
    }

    public static Map getMapOne() {
        return mapOne;
    }

    public static void setMapOne(Map mapOne) {
        LehisJourney.mapOne = mapOne;
    }

    public static Design getBasketOne() {
        return basketOne;
    }

    public static void setBasketOne(Design basketOne) {
        LehisJourney.basketOne = basketOne;
    }

    public static Tent getTentOne() {
        return tentOne;
    }

    public static void setTentOne(Tent tentOne) {
        LehisJourney.tentOne = tentOne;
    }

    
}
