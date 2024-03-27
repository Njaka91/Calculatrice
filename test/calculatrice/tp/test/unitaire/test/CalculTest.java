/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice.tp.test.unitaire.test;

import calculatrice.tp.test.unitaire.Calcul;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inclusiv academy
 */
public class CalculTest {
    
    @Test
    public void testAddition () 
    {
        //On prépare le scénario de test
        Calcul numbers = new Calcul();
        //verification des scenaria de test
        assertEquals(3, numbers.addition( 1, 2), 0.001);
        assertEquals(-2, numbers.addition(-4, 2), 0.001);
        assertEquals(4, numbers.addition(4, 0), 0.001);
    }
    
    @Test
    public void testSubstraction () 
    {
        //On prépare le scénario de test
        Calcul numbers = new Calcul();
        //verification des scenaria de test
        assertEquals(-1, numbers.substraction(1, 2), 0.001);
        assertEquals(-6, numbers.substraction(-4, 2), 0.001);
        assertEquals(4, numbers.substraction(4, 0), 0.001);
    }
    
    @Test
    public void testMultiplication () 
    {
        //On prépare le scénario de test
        Calcul numbers = new Calcul();//verification des scenaria de test
        assertEquals(2, numbers.multiplication(1, 2), 0.001);
        assertEquals(-8, numbers.multiplication(-4, 2), 0.001);
        assertEquals(0, numbers.multiplication(4, 0), 0.001);
    }
    
    @Test
    public void testDivisioin () 
    {
        //On prépare le scénario de test
        Calcul numbers = new Calcul(); //verification des scenaria de test
        assertEquals(0.5, numbers.division(1, 2), 0.001);
        assertEquals(-2, numbers.division(-4, 2), 0.001);
        assertEquals(0, numbers.division(0, 4), 0.001);
        try {
            numbers.division(4, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne doit pas être 0", e.getMessage());
        }
    }
}
