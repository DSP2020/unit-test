package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp() { tortillaMaiz = new TortillaMaiz(); }

    @Test
    public void testCurrentTemperature(){
        assertEquals(0, tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void testToasting(){
        assertEquals(0, tortillaMaiz.getToastTemperature());
    }

    @Test
    public void testToast(){
        assertFalse(tortillaMaiz.isToasted());
    }
}