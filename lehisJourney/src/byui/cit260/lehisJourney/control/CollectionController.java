
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import byui.cit260.lehisJourney.exceptions.CollectionControllerException;
import byui.cit260.lehisJourney.model.Game;
import byui.cit260.lehisJourney.view.ErrorView;
import java.util.ArrayList;

/**
 *
 * @author Melissa Case
 */
public class CollectionController {

    public static boolean list;
    private static ArrayList<String> design = new ArrayList<>();

    public  ArrayList<String> collection(String a[]) throws CollectionControllerException {

        design.add("goat hair");
        design.add("camel hair");
        design.add("goat skin");
        design.add("camel skin");

        for (String collection : design) {
           int i = design.indexOf(design);
            ErrorView.display(this.getClass().getName(),"The items needed to design a basket are: " + design);
            //throw new CollectionControllerException("The items needed to design a basket are:" + design);
        }
      return design;
    }

    

    public static void compareList(String userInput)
            throws CollectionControllerException {

        boolean isFound = false;
        for (String basket : design) {

            if (basket == userInput) {

                isFound = true;
            }
        }
        if (isFound == false) {
            throw new CollectionControllerException("You cannot make the basket yet,"
                    + "because "+ design + "is not the right choice");
        }

    }

    public static boolean isList() {
        return list;
    }

    public static void setList(boolean list) {
        CollectionController.list = list;
    }

    public boolean getCamelHair(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getGoatHair(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getGoatSkin(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getCamelSkin(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getPrintReport(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
