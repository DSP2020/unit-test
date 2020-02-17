package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest
{
   Quesadilla quesadilla;
   //Queso mockedQueso;
   //QuesoChihuahua mockedQueso;
   QuesoManchego  mockedQueso;
   //Tortilla mockedTortilla;
   //TortillaMaiz mockedTortilla;
    TortillaHarina mockedTortilla;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
     //mockedQueso = mock(Queso.class);    //Pruebas con clase Queso
    //mockedQueso = mock(QuesoChihuahua.class); //Pruebas con clase QuesoChihuahua
      mockedQueso = mock(QuesoManchego.class);  //Pruebas con clase QuesoManchego
      //mockedTortilla = mock(Tortilla.class);
       //mockedTortilla = mock(TortillaMaiz.class);
       mockedTortilla = mock(TortillaHarina.class);
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
       //fail("Please implement corresponding test");
	   when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       //verify(mockedTortilla,never()).toast(true);
      //verify(mockedQueso,times(1)).melt(false);
   }
   @Test
   public void noHayGas(){
      //fail("Please implement corresponding test");
	  when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       //verify(mockedTortilla,never()).toast(false);
       //verify(mockedQueso,times(1)).melt(false);
   }
}
