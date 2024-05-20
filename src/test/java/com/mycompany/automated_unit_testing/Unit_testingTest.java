/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yamik
 */
public class Unit_testingTest {
    
    public Unit_testingTest() {
    }

    @Test
    public void testAdditionMethod() {
        
        //Create an instance of the class
        Unit_testing ut = new Unit_testing();
        
        int expected = 4;
        int actual = ut.addition(2,2);
        
        assertEquals(expected,actual);
    }
    public void testSubtractionMethod(){
       
        //Create an instance of the class
        Unit_testing ut = new Unit_testing();
        
        int expected = 6;
        int actual = ut.addition(10,4);
        
        assertEquals(expected,actual);
}
    @Test
    public void testMessage(){
        
        //Create an instance of the class 
         Unit_testing ut = new Unit_testing();
         
         String expected = "Hello World!";
         String actual = ut.message();
         
         assertEquals(expected,actual);
    }
}
    
