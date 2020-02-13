package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class TortillaMaizTest {
    TortillaMaiz tortillaMaiz;

    @Before
    public void setUp(){
        tortillaMaiz = new TortillaMaiz();
    }

    @Test
    public void testCurrentTemperature(){
        tortillaMaiz.setCurrentTemperature(12);
        assertEquals(12, tortillaMaiz.getCurrentTemperature());
    }

    @Test
    public void testFalseToasted(){
        tortillaMaiz.toast(false);
        assertFalse(tortillaMaiz.isToasted());
    }

    @Test
    public void testTrueToasted(){
        tortillaMaiz.toast(true);
        assertTrue(tortillaMaiz.isToasted());
    }

    public void testToast(){
        assertEquals(10, tortillaMaiz.getToastTemperature());
    }

}
