package mx.iteso.ut;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

public class QuesadillaTest
{
    int elemQ = 0, elemT = 0;
   Quesadilla quesadilla;

   Queso mockedQueso;
   //QuesoChihuahua mockedQueso;
   //QuesoManchego mockedQueso;
   Tortilla mockedTortilla;
   //TortillaHarina mockedTortilla;
   //TortillaMaiz mockedTortilla;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();

      switch (elemT){
          case 0:
              switch (elemQ){
                  case 0:
                      mockedQueso = mock(Queso.class);
                      mockedTortilla = mock(Tortilla.class);
                      break;
                  case 1:
                      mockedQueso = mock(QuesoChihuahua.class);
                      mockedTortilla = mock(Tortilla.class);
                      break;
                  case 2:
                      mockedQueso = mock(QuesoManchego.class);
                      mockedTortilla = mock(Tortilla.class);
              }
              break;
          case 1:
              switch (elemQ){
                  case 0:
                      mockedQueso = mock(Queso.class);
                      mockedTortilla = mock(TortillaMaiz.class);
                      break;
                  case 1:
                      mockedQueso = mock(QuesoChihuahua.class);
                      mockedTortilla = mock(TortillaMaiz.class);
                      break;
                  case 2:
                      mockedQueso = mock(QuesoManchego.class);
                      mockedTortilla = mock(TortillaMaiz.class);
              }
              break;
          case 2:
              switch (elemQ){
                  case 0:
                      mockedQueso = mock(Queso.class);
                      mockedTortilla = mock(TortillaHarina.class);
                      break;
                  case 1:
                      mockedQueso = mock(QuesoChihuahua.class);
                      mockedTortilla = mock(TortillaHarina.class);
                      break;
                  case 2:
                      mockedQueso = mock(QuesoManchego.class);
                      mockedTortilla = mock(TortillaHarina.class);
              }
              break;
      }

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
       when(mockedQueso.getMeltingTemperature()).thenReturn(30);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
   }
  @Test
   public void noHayGas(){
     // fail("Please implement corresponding test");
      when(mockedQueso.isMelted()).thenReturn(false);
      when(mockedTortilla.isToasted()).thenReturn(false);
	  when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
      when(mockedTortilla.getToastTemperature()).thenReturn(30);
      when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
      when(mockedQueso.getMeltingTemperature()).thenReturn(30);
      assertEquals("You ran out of gas",quesadilla.prepareSingle());
   }
}
