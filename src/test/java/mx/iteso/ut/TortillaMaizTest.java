package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class TortillaMaizTest {
    TortillaMaiz mockedTortillaM;
    //Tortilla mockedTortilla;

    @Before
    public void setUp(){
        mockedTortillaM = new TortillaMaiz();
        mockedTortillaM = mock(TortillaMaiz.class);
        //mockedTortilla = mock(Tortilla.class);
        //mockedQueso.setCurrentTemperature(mockedQueso.getCurrentTemperature());
        //quesadilla.setTortilla(mockedTortilla);


    }
    @Test
    public void TortillaMPerfecta(){
        when(mockedTortillaM.isToasted()).thenReturn(true);
        //when(mockedTortilla.isToasted()).thenReturn(true);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        //when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortillaM.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaM.getToastTemperature()).thenReturn(10);
        //assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortillaM,times(1)).toast(true);
        //verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void TortillaMMala(){
        when(mockedTortillaM.isToasted()).thenReturn(false);
        //when(mockedTortilla.isToasted()).thenReturn(true);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        //when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortillaM.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaM.getToastTemperature()).thenReturn(10);
        //assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortillaM,times(1)).toast(false);
        //verify(mockedQueso,times(1)).melt(true);
    }
}
