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
   Tortilla mockedTortilla1;
   Tortilla mockedTortilla2;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla1 = mock(Tortilla.class);
      mockedTortilla2 = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla1(mockedTortilla1);
      quesadilla.setTortilla2(mockedTortilla2);
   }

   @Test
   public void quesadillaPerfecta(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla1.isToasted()).thenReturn(true);
       //Tortilla
       when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla1.getToastTemperature()).thenReturn(10);
       //Queso
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);

       assertEquals("Perfect quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla1,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void quesadillaBuena(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla1.isToasted()).thenReturn(false);
       //Tortilla
       when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla1.getToastTemperature()).thenReturn(20);
       //Queso
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       
       assertEquals("Good quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla1,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void quesadillaTerrible(){
       //fail("Please implement corresponding test");
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla1.isToasted()).thenReturn(true);
       //Tortilla
       when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla1.getToastTemperature()).thenReturn(10);
       //Queso
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,9);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);

       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla1,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);

   }
   
   @Test
   public void noHayGas(){
      //fail("Please implement corresponding test");
      when(mockedQueso.isMelted()).thenReturn(false);
      when(mockedTortilla1.isToasted()).thenReturn(false);
      //Tortilla
      when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
      when(mockedTortilla1.getToastTemperature()).thenReturn(20);
      //Queso
      when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,9);
      when(mockedQueso.getMeltingTemperature()).thenReturn(10);

      assertEquals("You ran out of gas",quesadilla.prepareSingle());
      verify(mockedTortilla1,never()).toast(true);
      verify(mockedQueso,never()).melt(true);
   }

   @Test
   public void doublePerfectQuesadilla(){

    when(mockedQueso.isMelted()).thenReturn(true);
    when(mockedTortilla1.isToasted()).thenReturn(true);
    when(mockedTortilla2.isToasted()).thenReturn(true);

    //Tortilla1
    when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla1.getToastTemperature()).thenReturn(10);

    //Tortilla2
    when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla2.getToastTemperature()).thenReturn(10);

    //Queso
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);

    assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla1,times(1)).toast(true);
    verify(mockedTortilla2,times(1)).toast(true);
    verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void doubleAlmostPerfectQuesadilla(){

    when(mockedQueso.isMelted()).thenReturn(true);
    when(mockedTortilla1.isToasted()).thenReturn(false);
    when(mockedTortilla2.isToasted()).thenReturn(true);

    //Tortilla1
    when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla1.getToastTemperature()).thenReturn(20);

    //Tortilla2
    when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedTortilla2.getToastTemperature()).thenReturn(10);

    //Queso
    when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
    when(mockedQueso.getMeltingTemperature()).thenReturn(10);

    assertEquals("Almost perfect quesadilla",quesadilla.prepareDouble());
    verify(mockedTortilla1,never()).toast(true);
    verify(mockedTortilla2,times(1)).toast(true);
    verify(mockedQueso,times(1)).melt(true);
   }
}
