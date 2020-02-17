package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TortillaHarinaTest {

    TortillaHarina tortillaharina;

    @Before
    public void setUp(){
        tortillaharina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaharina.setCurrentTemperature(16);
        assertEquals(16,tortillaharina.getCurrentTemperature());
    }
    @Test
    public void testFalseToast(){
        tortillaharina.toast(false);
        assertFalse(tortillaharina.isToasted());
    }
    @Test
    public void testTrueToast(){
        tortillaharina.toast(true);
        assertTrue(tortillaharina.isToasted());
    }
    @Test
    public void testToasting(){
        assertEquals(15,tortillaharina.getToastTemperature());
    }


}
