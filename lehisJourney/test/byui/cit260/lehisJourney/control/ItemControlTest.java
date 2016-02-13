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

    /**
     * Test of calcLabansChallenge method, of class ItemControl.
     */
    @Test
    public void testCalcLabansChallenge() {
        System.out.println("calcLabansChallenge");
        /**********
         * Case Test #1
         **********/
        
        double height = 42.0;
        double diameter = 28.0;
        ItemControl instance = new ItemControl();
        double expResult = 25861.59;
        double result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
        
        /**********
         * Case Test #2
         **********/
        
        height = 50.0;
        diameter = 24.0;
        
        expResult = -1;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
        
        /**********
         * Case Test #3
         **********/
        
        height = 38.0;
        diameter = 2.0;
        
        expResult = -1;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
        
        /**********
         * Case Test #4
         **********/
        
        height = 6.0;
        diameter = 37.0;
        
        expResult = -1;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
    
    /**********
         * Case Test #5
         **********/
        
        height = 36.0;
        diameter = 30.0;
        
        expResult = 25446.9;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
        
        /**********
         * Case Test #6
         **********/
        
        height = 48.0;
        diameter = 24.0;
        
        expResult = 21714.69;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.01);
        
        /**********
         * Case Test #7
         **********/
        
        height = 48.0;
        diameter = 30.0;
        
        expResult = 33929.222;
        result = instance.calcLabansChallenge(height, diameter);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of calcAreaTentRoom method, of class ItemControl.
     */
    @Test
    public void testCalcAreaTentRoom() {
          /**********
         * Test #1
         **********/
        System.out.println("calcAreaTentRoom");
        double length = 16.0;
        double width = 16.0;
        double height = 8.0;
        int peopleInRoom = 2;
        ItemControl instance = new ItemControl();
        double expResult = 256.0;
        double result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #2
         **********/
        length = 24.0;
        width = 16.0;
        height = 8.0;
        peopleInRoom = 2;
        expResult = -1;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #3
         **********/
        length = 20.0;
        width = -4.0;
        height = 8.0;
        peopleInRoom = 2;
        expResult = -1;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #4
         **********/
        length = 16.0;
        width = 22.0;
        height = 10.0;
        peopleInRoom = 3;
        expResult = -1;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #5
         **********/
        length = 18.0;
        width = 18.0;
        height = 8.0;
        peopleInRoom = 3;
        expResult = 324;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #5
         **********/
        length = 19.0;
        width = 19.0;
        height = 8.0;
        peopleInRoom = 1;
        expResult = -1;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
        
         /**********
         * Test #6
         **********/
        length = 20.0;
        width = 20.0;
        height = 8.0;
        peopleInRoom = 4;
        expResult = 400;
        result = instance.calcAreaTentRoom(length, width, height, peopleInRoom);
        assertEquals(expResult, result, 0.01);
    }
    
}
