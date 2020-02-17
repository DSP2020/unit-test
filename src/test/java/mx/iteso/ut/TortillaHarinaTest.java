package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TortillaHarinaTest {
TortillaHarina tortillaHarina;
	
	@Before
	public void setUp() {
		this.tortillaHarina = new TortillaHarina();
	}
	
	@Test
	public void testCurrentTemperature() {
		tortillaHarina.setCurrentTemperature(95);
		assertEquals(95, tortillaHarina.getCurrentTemperature());
	}
	
	@Test
	public void testTrueMelt() {
		tortillaHarina.toast(true);
		assertTrue(tortillaHarina.isToasted());
	}
	
	@Test
	public void testFalseMelt() {
		tortillaHarina.toast(false);
		assertFalse(tortillaHarina.isToasted());
	}
	
	@Test
	public void testMelting() {
		assertEquals(20, tortillaHarina.getToastTemperature());
	}
	
}
