package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(21);
        assertEquals(21,tortillaMaiz.getCurrentTemperature());
    }
    @Test
    public void testFalseMelt(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }
    @Test
    public void testTrueMelt(){
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(20,tortillaMaiz.getToastTemperature());
    }
}
