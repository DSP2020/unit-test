package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp() { tortillaHarina = new TortillaHarina(); }

    @Test
    public void testCurrentTemperature(){
        assertEquals(0, tortillaHarina.getCurrentTemperature());
    }

    @Test
    public void testToasting(){
        assertEquals(0, tortillaHarina.getToastTemperature());
    }

    @Test
    public void testToast(){
        assertFalse(tortillaHarina.isToasted());
    }
}
