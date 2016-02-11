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
        /**********
         * Test Case #1
         **********/
        System.out.println("calcBasketVolume");
        double height = 32.0;
        double width = 15.0;
        double length = 30.0;
        ItemControl instance = new ItemControl();
        double expResult = 0.48;
        double result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #2
         *************/
        System.out.println("calcBasketVolume");
        height = -1.0;
        width = 24.0;
        length = 24.0;
        
        expResult = -1;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #3
         *************/
        System.out.println("calcBasketVolume");
        height = 24.0;
        width = -6.0;
        length = 28.0;
        
        expResult = -1;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #4
         *************/
        System.out.println("calcBasketVolume");
        height = 32.0;
        width = 21.0;
        length = 5.0;
        
        expResult = -1;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #5
         *************/
        System.out.println("calcBasketVolume");
        height = 36.0;
        width = 12.0;
        length = 36.0;
        
        expResult = .44;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #6
         *************/
        System.out.println("calcBasketVolume");
        height = 36.0;
        width = 24.0;
        length = 12.0;
        
        expResult = .67;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        /*************
         * Test case #7
         *************/
        System.out.println("calcBasketVolume");
        height = 36.0;
        width = 24.0;
        length = 36.0;
        
        expResult = .22 ;
        result = instance.calcBasketVolume(height, width, length);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
