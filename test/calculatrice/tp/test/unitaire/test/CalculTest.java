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
        Calcul numbersPositiv = new Calcul(1, 2);
        Calcul numbersNegativ = new Calcul(-4, 2);
        Calcul numbersZero = new Calcul(-4, 0);
        //verification des scenaria de test
        assertEquals(3, numbersPositiv.addition(), 0.001);
        assertEquals(-2, numbersNegativ.addition(), 0.001);
        assertEquals(-4, numbersZero.addition(), 0.001);
    }
    
    @Test
    public void testSubstraction () 
    {
        //On prépare le scénario de test
        Calcul numbersPositiv = new Calcul(1, 2);
        Calcul numbersNegativ = new Calcul(-4, 2);
        Calcul numbersZero = new Calcul(4, 0);
        //verification des scenaria de test
        assertEquals(-1, numbersPositiv.substraction(), 0.001);
        assertEquals(-6, numbersNegativ.substraction(), 0.001);
        assertEquals(4, numbersZero.substraction(), 0.001);
    }
    
    @Test
    public void testMultiplication () 
    {
        //On prépare le scénario de test
        Calcul numbersPositiv = new Calcul(1, 2);
        Calcul numbersNegativ = new Calcul(-4, 2);
        Calcul numbersZero = new Calcul(4, 0);
        //verification des scenaria de test
        assertEquals(2, numbersPositiv.multiplication(), 0.001);
        assertEquals(-8, numbersNegativ.multiplication(), 0.001);
        assertEquals(0, numbersZero.multiplication(), 0.001);
    }
    
    @Test
    public void testDivisioin () 
    {
        //On prépare le scénario de test
       Calcul numbersPositiv = new Calcul(1, 2);
        Calcul numbersNegativ = new Calcul(-4, 2);
        Calcul numbersZero = new Calcul(0, 4);
        Calcul numbersInfiny = new Calcul(4, 0);
        //verification des scenaria de test
        assertEquals(0.5, numbersPositiv.division(), 0.001);
        assertEquals(-2, numbersNegativ.division(), 0.001);
        assertEquals(0, numbersZero.division(), 0.001);
        try {
            numbersInfiny.division();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }
    }
}
