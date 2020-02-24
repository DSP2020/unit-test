package mx.iteso.ut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class QuesoManchegoTest {
	QuesoManchego quesoManchego;
	
	@Before
	public void setUp() {
		this.quesoManchego = new QuesoManchego();
	}
	
	@Test
	public void testCurrentTemperature() {
		quesoManchego.setCurrentTemperature(73);
		assertEquals(73, quesoManchego.getCurrentTemperature());
	}
	
	@Test
	public void testTrueMelt() {
		quesoManchego.melt(true);
		assertTrue(quesoManchego.isMelted());
	}
	
	@Test
	public void testFalseMelt() {
		quesoManchego.melt(false);
		assertFalse(quesoManchego.isMelted());
	}
	
	@Test
	public void testMelting() {
		assertEquals(90, quesoManchego.getMeltingTemperature());
	}
	
}
