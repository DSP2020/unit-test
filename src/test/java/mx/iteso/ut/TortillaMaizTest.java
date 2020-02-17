package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TortillaMaizTest {
TortillaMaiz tortillaMaiz;
	
	@Before
	public void setUp() {
		this.tortillaMaiz = new TortillaMaiz();
	}
	
	@Test
	public void testCurrentTemperature() {
		tortillaMaiz.setCurrentTemperature(20);
		assertEquals(20, tortillaMaiz.getCurrentTemperature());
	}
	
	@Test
	public void testTrueMelt() {
		tortillaMaiz.toast(true);
		assertTrue(tortillaMaiz.isToasted());
	}
	
	@Test
	public void testFalseMelt() {
		tortillaMaiz.toast(false);
		assertFalse(tortillaMaiz.isToasted());
	}
	
	@Test
	public void testMelting() {
		assertEquals(35, tortillaMaiz.getToastTemperature());
	}
	
}
