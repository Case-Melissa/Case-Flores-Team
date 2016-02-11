/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author home
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of calcBasketVolume method, of class ItemControl.
     */
    @Test
    public void testCalcBasketVolume() {
        System.out.println("calcBasketVolume");
        double height = 32.0;
        double width = 15.0;
        double length = 30.0;
        ItemControl instance = new ItemControl();
        double expResult = 0.48;
        double result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
