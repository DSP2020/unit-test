package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class TortillaHarinaTest {
    TortillaHarina tortillaHarina;

    @Before
    public void setUp(){
        tortillaHarina = new TortillaHarina();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaHarina.setCurrentTemperature(9);
        assertEquals(9, tortillaHarina.getCurrentTemperature());
    }

    @Test
    public void testFalseToasted(){
        tortillaHarina.toast(false);
        assertFalse(tortillaHarina.isToasted());
    }

    @Test
    public void testTrueToasted(){
        tortillaHarina.toast(true);
        assertTrue(tortillaHarina.isToasted());
    }

    public void testToast(){
        assertEquals(10, tortillaHarina.getToastTemperature());
    }
}

