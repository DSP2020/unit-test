package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setup(){
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(10);
        assertEquals(10, tortillaHarina.getCurrentTemperature());
    }

    @Test
    public void testTrueToasted(){
        tortillaHarina.toast(true);
        assertEquals(true, tortillaHarina.isToasted());
    }

    @Test
    public void testFalseToasted(){
        tortillaHarina.toast(false);
        assertEquals(false, tortillaHarina.isToasted());
    }
}
