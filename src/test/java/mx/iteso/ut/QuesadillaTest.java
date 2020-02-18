package mx.iteso.ut;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest
{
   Quesadilla quesadilla;
   Queso mockedQueso;
   Tortilla mockedTortilla;
   Tortilla mockedTortillaExtra;
  
   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla = mock(Tortilla.class);
      mockedTortillaExtra = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      quesadilla.setTortillaExtra(mockedTortillaExtra);

    
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
       
       //fail("Please implement corresponding test");
   }
   @Test
   public void noHayGas(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   //Quesadilla Doble
   @Test
   public void quesadillaPerfectaDouble(){
       when(mockedQueso.isMelted()).thenReturn(true);
       // Tortilla 1
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       // Tortiall 2
       when(mockedTortillaExtra.isToasted()).thenReturn(true);
       when(mockedTortillaExtra.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaExtra.getToastTemperature()).thenReturn(10);
       
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       
       assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedTortillaExtra,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   @Test
   public void quesadillaBuenaDouble() { 
        when(mockedQueso.isMelted()).thenReturn(true);
        //Tortiall 1
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        //Tortiall 2
        when(mockedTortillaExtra.isToasted()).thenReturn(true);
        when(mockedTortillaExtra.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaExtra.getToastTemperature()).thenReturn(10);
       //Queso 
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
           
        assertEquals("Good quesadilla", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(true);
        verify(mockedTortillaExtra,times(1)).toast(true);
        verify(mockedQueso, times(1)).melt(true);
    }
   @Test
   public void quesadillaTerribleDouble() {

        when(mockedQueso.isMelted()).thenReturn(false);
        //Tortilla 1
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
        //Tortilla 2
       when(mockedTortillaExtra.isToasted()).thenReturn(true);
       when(mockedTortillaExtra.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortillaExtra.getToastTemperature()).thenReturn(20);
       // Queso
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        
       assertEquals("Terrible quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedTortillaExtra,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);

    }
   @Test
   public void noHayGasDouble(){
        when(mockedQueso.isMelted()).thenReturn(false);
        //Tortilla 1
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2, 8, 8, 14, 20);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        //Tortilla 2
        when(mockedTortillaExtra.isToasted()).thenReturn(false);
        when(mockedTortillaExtra.getCurrentTemperature()).thenReturn(2, 8, 8, 14, 20);
        when(mockedTortillaExtra.getToastTemperature()).thenReturn(20);
        //Queso
        when(mockedQueso.getCurrentTemperature()).thenReturn(2, 8, 8, 8, 14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        
        assertEquals("You ran out of gas", quesadilla.prepareDouble());
        verify(mockedTortilla, never()).toast(false);
        verify(mockedTortillaExtra, never()).toast(false);
        verify(mockedQueso, never()).melt(false);
    }

  
}
