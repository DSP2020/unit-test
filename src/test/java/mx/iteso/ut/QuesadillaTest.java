package mx.iteso.ut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class QuesadillaTest {
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
   
   @Test
   public void quesadillaDoubleExcellent(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(true);
	   when(mockedTortilla.isToasted()).thenReturn(true);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   } 

   @Test
   public void quesadillaDoublePerfect(){
	  Tortilla mockedTortilla2 = mock(Tortilla.class);
	  quesadilla.setTortilla2(mockedTortilla2);
	  
	  when(mockedQueso.isMelted()).thenReturn(true);
	  when(mockedTortilla.isToasted()).thenReturn(false);
	  when(mockedTortilla2.isToasted()).thenReturn(true);
	  when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	  when(mockedTortilla.getToastTemperature()).thenReturn(10);
	  when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	  when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	  when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	  when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	  assertEquals("Excellent quesadilla",quesadilla.prepareDouble());
	  verify(mockedTortilla,times(1)).toast(true);
	  verify(mockedQueso,times(1)).melt(true);
   }
   
   @Test
   public void quesadillaDoubleGood(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(false);
	   when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("Good quesadilla",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   }
   
   @Test
   public void quesadillaDoubleNormal(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(true);
	   when(mockedTortilla.isToasted()).thenReturn(true);
	   when(mockedTortilla2.isToasted()).thenReturn(false);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("Normal quesadilla",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   }

   @Test
   public void quesadillaDoubleTerrible(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(true);
	   when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(false);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("Terrible quesadilla",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   }
   
   @Test
   public void quesadillaDoubleHorrible(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(false);
	   when(mockedTortilla.isToasted()).thenReturn(true);
	   when(mockedTortilla2.isToasted()).thenReturn(true);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("Horrible quesadilla",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   }
   
   @Test
   public void noHayGasDouble(){
	   Tortilla mockedTortilla2 = mock(Tortilla.class);
	   quesadilla.setTortilla2(mockedTortilla2);
		  
	   when(mockedQueso.isMelted()).thenReturn(false);
	   when(mockedTortilla.isToasted()).thenReturn(false);
	   when(mockedTortilla2.isToasted()).thenReturn(false);
	   when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla.getToastTemperature()).thenReturn(10);
	   when(mockedTortilla2.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedTortilla2.getToastTemperature()).thenReturn(10);
	   when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
	   when(mockedQueso.getMeltingTemperature()).thenReturn(10);
	   assertEquals("You ran out of gas",quesadilla.prepareDouble());
	   verify(mockedTortilla,times(1)).toast(true);
	   verify(mockedQueso,times(1)).melt(true);
   } 

}
