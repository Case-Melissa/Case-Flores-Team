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
import byui.cit260.lehisJourney.view.ErrorView;
import byui.cit260.lehisJourney.view.StartProgramView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author home
 */
public class LehisJourney {

    protected final BufferedReader keyboard = LehisJourney.getInFile();
    protected final PrintWriter console = LehisJourney.getOutFile();

    private static Player player;
    private static Game game;
    private static Map mapOne = new Map();
    private static Design basketOne = new Design();
    private static Tent tentOne = new Tent();

    private static PrintWriter outFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LehisJourney.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LehisJourney.inFile = inFile;
    }
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LehisJourney.logFile = logFile;
    }

    public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            LehisJourney.inFile = new BufferedReader(new InputStreamReader(System.in));
            LehisJourney.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            LehisJourney.logFile = new PrintWriter(filePath);

            StartProgramView startView = new StartProgramView();
            
            startView.startProgram();

        } catch (Exception e) {
            e.printStackTrace();
            
        }

       finally {
            try {
            if (LehisJourney.inFile != null) {
                LehisJourney.inFile.close();
            }

            if (LehisJourney.outFile != null) {
                LehisJourney.outFile.close();
            }

            if (LehisJourney.logFile != null) {
                LehisJourney.logFile.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(LehisJourney.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("main - Error closing files");
            return;
        }
        LehisJourney.outFile.close();
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
