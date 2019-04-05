/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gorka
 */
public class ProjecteTest {
    
    @Test
    public void testMain() {
    }

    @Test
    public void testSuma() {
        
        Projecte p = new Projecte();
        int i=10, x=20;
        
        int res = p.suma(i,x);
        
        assertEquals(res,30);
        
    }
    
}
