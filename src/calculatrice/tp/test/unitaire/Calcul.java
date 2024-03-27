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

    public float addition ()
    {
        return this.a + this.b;
    }
    
    public float substraction ()
    {
        return this.a - this.b;
    }
    
    public float multiplication ()
    {
        return this.a * this.b;
    }
    
    public float division ()
    {
        if (this.b ==0) 
        {
           throw new IllegalArgumentException("Le diviseur ne peut être zéro"); 
        }
        return this.a / this.b;
    }
}
