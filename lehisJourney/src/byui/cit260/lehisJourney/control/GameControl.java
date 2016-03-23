/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.model.Game;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lehisjourney.LehisJourney;

/**
 *
 * @author Melissa Case
 */
public class GameControl {

    public void saveGame(Game game, String filepath)
            throws GameControlException, IOException {
        try(FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
    }
    
    
    
    
   public static void saveCurrentGame(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public static void getSavedGame(String filepath) throws GameControlException{
        Game g = null;
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            g = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        LehisJourney.setCurrentGame(g);
    }
    
}
