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
   QuesoChihuahua mockedQuesoChihuahua;
   QuesoManchego mockedQuesoManchego;
   Tortilla mockedTortilla;
   Tortilla mockedTortilla1;
   TortillaHarina mockedTortillaHarina;
   TortillaMaiz mockedTortillaMaiz;


   @Before
   public void setUp() {
      quesadilla = new Quesadilla();
      mockedQueso = mock(Queso.class);
      mockedQuesoChihuahua = mock(QuesoChihuahua.class);
      mockedQuesoManchego = mock(QuesoManchego.class);
      mockedTortilla = mock(Tortilla.class);
      mockedTortilla1 = mock(Tortilla.class);
      mockedTortillaHarina = mock(TortillaHarina.class);
      mockedTortillaMaiz = mock(TortillaMaiz.class);
      quesadilla.setQueso(mockedQueso);
      quesadilla.setTortilla(mockedTortilla);
      quesadilla.setTortillaH(mockedTortillaHarina);
      quesadilla.setTortillaM(mockedTortillaMaiz);
      quesadilla.setQuesoC(mockedQuesoChihuahua);
      quesadilla.setQuesoM(mockedQuesoManchego);



   }
   @Test
   public void quesadillaPerfecta() {
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
   public void quesadillaBuena() {
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
   public void quesadillaTerrible() {
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
   public void noHayGas() {
       when(mockedQueso.isMelted()).thenReturn(false);
       when(mockedTortilla.isToasted()).thenReturn(false);
       when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedTortilla.getToastTemperature()).thenReturn(20);
       when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
       when(mockedQueso.getMeltingTemperature()).thenReturn(10);
       assertEquals("You ran out of gas",quesadilla.prepareSingle());
       verify(mockedTortilla,never()).toast(true);
       verify(mockedQueso,times(1)).melt(true);
       //fail("Please implement corresponding test");
   }

    @Test
    public void quesadillaPerfectaD() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(10);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareDouble());
        verify(mockedTortilla,times(1)).toast(true);
        verify(mockedTortilla1,times(1)).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaD() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla t1 not toasted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaD1() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla t2 not toasted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaD2() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla q not melted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerribleD() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(true);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla q not melted && t1 not toasted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void quesadillaTerribleD1() {
        when(mockedQueso.isMelted()).thenReturn(true);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla neither t is toasted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void quesadillaTerribleD2() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(true);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla q not melted && t2 not toasted",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }

    @Test
    public void noHayGasD() {
        when(mockedQueso.isMelted()).thenReturn(false);
        when(mockedTortilla.isToasted()).thenReturn(false);
        when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla.getToastTemperature()).thenReturn(20);
        when(mockedTortilla1.isToasted()).thenReturn(false);
        when(mockedTortilla1.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortilla1.getToastTemperature()).thenReturn(10);
        when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQueso.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareDouble());
        verify(mockedTortilla,never()).toast(true);
        verify(mockedQueso,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }

    @Test
    public void quesadillaPerfectaMaizManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(10);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingleMaizManchego());
        verify(mockedTortillaMaiz,times(1)).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaMaizManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingleMaizManchego());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerribleMaizManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingleMaizManchego());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void noHayGasMaizManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareSingleMaizManchego());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }

    @Test
    public void quesadillaPerfectaMaizChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(10);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingleMaizChihuahua());
        verify(mockedTortillaMaiz,times(1)).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaMaizChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingleMaizChihuahua());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerribleMaizChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(true);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingleMaizChihuahua());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void noHayGasMaizChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedTortillaMaiz.isToasted()).thenReturn(false);
        when(mockedTortillaMaiz.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaMaiz.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareSingleMaizChihuahua());
        verify(mockedTortillaMaiz,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }

    @Test
    public void quesadillaPerfectaHarinaManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(10);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingleHarinaManchego());
        verify(mockedTortillaHarina,times(1)).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaHarinaManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingleHarinaManchego());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerribleHarinaManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingleHarinaManchego());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void noHayGasHarinaManchego() {
        when(mockedQuesoManchego.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoManchego.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoManchego.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareSingleHarinaManchego());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoManchego,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void quesadillaPerfectaHarinaChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(10);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Perfect quesadilla",quesadilla.prepareSingleHarinaChihuahua());
        verify(mockedTortillaHarina,times(1)).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
    }
    @Test
    public void quesadillaBuenaHarinaChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(true);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Good quesadilla",quesadilla.prepareSingleHarinaChihuahua());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
    }
    @Test
    public void quesadillaTerribleHarinaChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(true);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("Terrible quesadilla",quesadilla.prepareSingleHarinaChihuahua());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }
    @Test
    public void noHayGasHarinaChihuahua() {
        when(mockedQuesoChihuahua.isMelted()).thenReturn(false);
        when(mockedTortillaHarina.isToasted()).thenReturn(false);
        when(mockedTortillaHarina.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedTortillaHarina.getToastTemperature()).thenReturn(20);
        when(mockedQuesoChihuahua.getCurrentTemperature()).thenReturn(2,8,8,8,14);
        when(mockedQuesoChihuahua.getMeltingTemperature()).thenReturn(10);
        assertEquals("You ran out of gas",quesadilla.prepareSingleHarinaChihuahua());
        verify(mockedTortillaHarina,never()).toast(true);
        verify(mockedQuesoChihuahua,times(1)).melt(true);
        //fail("Please implement corresponding test");
    }

}
