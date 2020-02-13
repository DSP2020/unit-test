package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QuesoManchegoTest{

    QuesoManchego quesoManchego;

    @before
    void setUp(){
        quesoManchego = new QuesoManchego();
    }

    @test
    public void testCurrentTemperature(){
        quesoManchego.setCurrentTemperature(21);
        assertEquals(21,quesoManchego.getCurrentTemperature());
    }

    @test
    public void testFalseMelt(){
        quesoManchego.melt(false);
        assertFalse(quesoManchego.isMelted());
    }

    @test
    public void testTureMelt(){
        quesoManchego.melt(true);
        assertFalse(quesoManchego.isMelted());
    }

    @Test
    public void testMelting(){
        assertEquals(20,quesoManchego.getMeltingTemperature());
    }

}