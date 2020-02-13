package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QuesoManchegoTest {
    QuesoManchego quesoManchego;

    @Before
    public void setUp(){
        quesoManchego = new QuesoManchego();
    }

    @Test
    public void testCurrentTemperature(){
        assertEquals(0,quesoManchego.getCurrentTemperature());
    }
    @Test
    public void testMelt(){
        assertFalse(quesoManchego.isMelted());
    }
    @Test
    public void testMelting(){
        assertEquals(0,quesoManchego.getMeltingTemperature());
    }

}
