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
   Tortilla mockedTortilla2;

   @Before
   public void setUp(){
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedTortilla = mock(Tortilla.class);
	  mockedTortilla2 = mock(Tortilla.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
	  quesadilla.setTortilla2(mockedTortilla2);


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
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Terrible quesadilla",quesadilla.prepareSingle());
       verify(mockedTortilla,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
   }
   @Test
   public void noHayGas(){
      when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,never()).melt(true);
   }
   
    @Test
	public void quesadilladoblePerfecta(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(true);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Perfect double quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedTortilla2,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   
    @Test
	public void quesadilladoble2(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Good double quesadilla bad one tortilla",quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
	   verify(mockedTortilla2,times(1)).toast(true);
       verify(mockedQueso,times(1)).melt(true);
   }
   
   //if(getQueso().!isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted()) //quesadilladoble 3 
    @Test
	public void quesadilladoble3(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Bad double quesadilla bad one tortilla",quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
	   verify(mockedTortilla2,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
   }
   
    //if(!getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla2().isToasted())
    @Test
	public void quesadilladoble4(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Terrible double quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
	   verify(mockedTortilla2,never()).toast(true);
       verify(mockedQueso,never()).melt(true);
   }
   
   //if(getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla2().isToasted()
    @Test
	public void quesadilladoble5(){
       when(mockedQueso.isMelted()).thenReturn(true);
       when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("Bad double quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla, never()).toast(true);
	   verify(mockedTortilla2,never()).toast(true);
       verify(mockedQueso, times(1)).melt(true);
   }
   
   //if(!getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted()) 
   @Test
	public void quesadilladoble6(){
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(true);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(10);
       when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla2.getToastTemperature()).thenReturn(10);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(20);
       assertEquals("Good double quesadilla",quesadilla.prepareDouble());
       verify(mockedTortilla, times(1)).toast(true);
	   verify(mockedTortilla2,times(1)).toast(true);
       verify(mockedQueso,never()).melt(true);
}
}
