/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Melissa Case
 */
public abstract class PlayerMenuView extends View{
    
    public PlayerMenuView(){
       super("\n"
               + "\n----------------------------------"
               + "\nC Character Menu"
               + "\nP Player Location"
               + "\n----------------------------------"); 
    }
    @Override
    public boolean doAction(String value) {

        char selection = value.toUpperCase().charAt(0); //convert to all upper case

        switch (selection) {
            case 'C':
                break;
            case 'P':
                break;
}
        return false;
    }
public void savePlayerNeames(){
    FileWriter outFile = null;
    
    String fileLocation = "c:/player.txt";
    
    try {
        outFile = new FileWriter(fileLocation);
        outFile.write("Nephi\n");
        outFile.write("Sam\n");
        outFile.write("Laman\n");
        outFile.write("Lemuel\n");
        
        outFile.flush();
    }catch (IOException ex){
       ErrorView.display(this.getClass().getName(), "Error saving PLayers names to File");
    } finally{
        if (outFile !=null){
            try{
                outFile.close();
            } catch (IOException ex2) {
                ErrorView.display(this.getClass().getName(), "Error closing file");
            }
            }
        }
    }

}
    
