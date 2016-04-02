/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.TentControlException;
import byui.cit260.lehisJourney.model.Item;
import byui.cit260.lehisJourney.model.Tent;
import byui.cit260.lehisJourney.view.ErrorView;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author AllenMac
 */
public class TentController {

    public static int collectTentItems(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Oil");
        list.add("Four");
        list.add("Clothes");
        list.add("Tents");
        list.add("Stakes");
       
         
        Collections.shuffle(list);
        ErrorView.display(this.getClass().getName(), "The items you need in the tent are:");
        for(String str: list){
            ErrorView.display(this.getClass().getName(), str);
        }
      
    }
    public void collectTentItems(Tent tent, Item item) throws TentControlException {
        int newItem = (int) tent.getItems();

        if (newItem < 0) {
            ErrorView.display(this.getClass().getName(), "You have collected too much. Reduce your load");
        }
    }

    public  void collectTentItems(Item item, Item item0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
