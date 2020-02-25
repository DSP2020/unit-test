package mx.iteso.ut;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class TortillaHarinaTest {
    TortillaHarina mockedTortillaH;
    //Tortilla mockedTortilla;

    @Before
    public void setUp() {
        mockedTortillaH = new TortillaHarina();
        mockedTortillaH = mock(TortillaHarina.class);
        //mockedTortilla = mock(Tortilla.class);
        //mockedQueso.setCurrentTemperature(mockedQueso.getCurrentTemperature());
        //mockedTortillaH.toast(mockedTortillaH);


    }
    @Test
    public void TortillaHPerfecta() {
        when(mockedTortillaH.isToasted()).thenReturn(true);
        //when(mockedTortilla.isToasted()).thenReturn(true);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        //when(mockedTortillaH.getToastTemperature()).thenReturn(10);
        when(mockedTortillaH.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaH.getToastTemperature()).thenReturn(10);
        //assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortillaH,times(1)).toast(true);
        //verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void TortillaHMala() {
        when(mockedTortillaH.isToasted()).thenReturn(false);
        //when(mockedTortilla.isToasted()).thenReturn(true);
        //when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        //when(mockedTortillaH.getToastTemperature()).thenReturn(10);
        when(mockedTortillaH.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaH.getToastTemperature()).thenReturn(10);
        //assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
        verify(mockedTortillaH,times(1)).toast(false);
        //verify(mockedQueso,times(1)).melt(true);
    }
}
