
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import java.util.ArrayList;

/**
 *
 * @author Melissa Case
 */
public class CollectionController {

    public static boolean list;
    
    public static void collection(String a[]){       
        ArrayList<String> design = new ArrayList<>();
     design.add("goat hair");
     design.add("camel hair");
     design.add("goat skin");
     design.add("camel skin");
    
     for (String collection : design)
{
    int i = design.indexOf(design);
    System.out.println("The items needed to design a basket are: " + design );
}
    }

    public static boolean isList() {
        return list;
    }

    public static void setList(boolean list) {
        CollectionController.list = list;
    }

    
    
}
