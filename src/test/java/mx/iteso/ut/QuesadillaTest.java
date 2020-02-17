package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
//import org.mockito.Mockito.*;

public class QuesadillaTest
{
    Quesadilla quesadilla;
    Queso mockedQueso;
    Tortilla mockedTortilla;

    @Before
    public void setUp(){
        quesadilla = new Quesadilla();
        mockedQueso = mock(Queso.class);
        mockedTortilla = mock(Tortilla.class);
        quesadilla.setQueso(mockedQueso);
        quesadilla.setTortilla(mockedTortilla);
    }

    @Test
    public void quesadillaPerfecta(){
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void quesadillaBuena(){
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void quesadillaTerrible(){
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void noHayGas(){
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas", quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    public void quesadillaPerfectaDouble(){
        Tortilla mockedSecondTortilla = mock(Tortilla.class);

        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedSecondTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedSecondTortilla.isToasted()).thenReturn(false);
        when(mockedSecondTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedSecondTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareDouble(mockedSecondTortilla));
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void quesadillaBuenaDouble(){
        Tortilla mockedSecondTortilla = mock(Tortilla.class);

        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedSecondTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedSecondTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedSecondTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareDouble(mockedSecondTortilla));
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void quesadillaTerribleDouble(){
        Tortilla mockedSecondTortilla = mock(Tortilla.class);

        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedSecondTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedSecondTortilla.isToasted()).thenReturn(false);
        when(mockedSecondTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedSecondTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }

    @Test
    public void noHayGasDouble(){
        Tortilla mockedSecondTortilla = mock(Tortilla.class);

        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedSecondTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedSecondTortilla.isToasted()).thenReturn(false);
        when(mockedSecondTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedSecondTortilla.getToastTemperature()).thenReturn(20);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas", quesadilla.prepareDouble(mockedSecondTortilla));
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
   
}
