/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice.tp.test.unitaire;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author inclusiv academy
 */
@Data
@NoArgsConstructor
public class Calcul {
    
    private float a;
    private float b;

    public Calcul(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float addition (float a, float b)
    {
        return a + b;
    }
    
    public float substraction (float a, float b)
    {
        return a - b;
    }
    
    public float multiplication (float a, float b)
    {
        return a * b;
    }
    
    public float division (float a, float b)
    {
        if (b ==0) 
        {
           throw new IllegalArgumentException("Le diviseur ne doit pas être 0"); 
        }
        return a / b;
    }
}
