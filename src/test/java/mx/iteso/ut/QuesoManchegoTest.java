/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.iteso.ut;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author coque
 */
public class QuesoManchegoTest {
    QuesoManchego quesoManchego;
    
    @Before
    public void setUp(){
        quesoManchego = new QuesoManchego();
    }
    
    @Test
    public void testCurrentTemperature(){
        quesoManchego.setCurrentTemperature(21);
        assertEquals(21,quesoManchego.getCurrentTemperature());
    }
    
    @Test
    public void testFalseMelt(){
        quesoManchego.melt(false);
        assertFalse(quesoManchego.isMelted());
    }
    @Test
    public void testTrueMelt(){
        quesoManchego.melt(true);
        assertTrue(quesoManchego.isMelted());
    }
    @Test
    public void testMelting(){
        assertEquals(20,quesoManchego.getMeltingTemperature());
    }
}
