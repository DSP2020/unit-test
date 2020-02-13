package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setup(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(10);
        assertEquals(10, tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void testTrueToasted(){
        tortillaMaiz.toast(true);
        assertEquals(true, tortillaMaiz.isToasted());
    }

    @Test
    public void testFalseToasted(){
        tortillaMaiz.toast(false);
        assertEquals(false, tortillaMaiz.isToasted());
    }
}