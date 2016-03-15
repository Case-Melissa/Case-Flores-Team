/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author AllenMac
 */
public class TentController {
    
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Oil");
        list.add("Four");
        list.add("Clothes");
        list.add("Tents");
        list.add("Stakes");
       
         
        Collections.shuffle(list);
        System.out.println("The items you need in the tent are:");
        for(String str: list){
            System.out.println(str);
        }
      
    }
}
