package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class QuesoManchegoTest {



    QuesoManchego quesomanchego;

    @Before
    public void setUp(){
        quesomanchego = new QuesoManchego();
    }

    @Test
    public void testCurrentTemperature(){
        quesomanchego.setCurrentTemperature(16);
        assertEquals(16,quesomanchego.getCurrentTemperature());
    }
    @Test
    public void testFalseMelt(){
        quesomanchego.melt(false);
        assertFalse(quesomanchego.isMelted());
    }
    @Test
    public void testTrueMelt(){
        quesomanchego.melt(true);
        assertTrue(quesomanchego.isMelted());
    }
    @Test
    public void testMelting(){
        assertEquals(15,quesomanchego.getMeltingTemperature());
    }
}
