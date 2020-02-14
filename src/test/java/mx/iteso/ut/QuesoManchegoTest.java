package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class QuesoManchegoTest {
    QuesoManchego mockedQueso;
    //Tortilla mockedTortilla;

    @Before
    public void setUp(){
        mockedQueso = new QuesoManchego();
        mockedQueso = mock(QuesoManchego.class);
        //mockedTortilla = mock(Tortilla.class);
        //mockedQueso.setCurrentTemperature(mockedQueso.getCurrentTemperature());
        //quesadilla.setTortilla(mockedTortilla);


    }
    @Test
    public void ManchegoPerfecto(){
        when(mockedQueso.isMelted()).thenReturn(true);
        //when(mockedTortilla.isToasted()).thenReturn(true);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        //when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        //assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        //verify(mockedTortilla,times(1)).toast(true);
        //verify(mockedQueso,times(1)).melt(true);
    }
}
