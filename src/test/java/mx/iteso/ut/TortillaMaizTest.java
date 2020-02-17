package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TortillaMaizTest {


    TortillaMaiz tortillamaiz;

    @Before
    public void setUp(){
        tortillamaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillamaiz.setCurrentTemperature(21);
        assertEquals(21,tortillamaiz.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
        tortillamaiz.toast(false);
        assertFalse(tortillamaiz.isToasted());
    }
    @Test
    public void testTrueToast(){
        tortillamaiz.toast(true);
        assertTrue(tortillamaiz.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(20,tortillamaiz.getToastTemperature());
    }

}
