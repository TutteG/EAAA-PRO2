package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Nedbør;

public class NedbørTester {
	Nedbør nb;
	int[] nedbørPrUge = { // 52 uger i alt
			20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13, 15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78,
			0, 0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18, 19, 21, 32, 24, 13 };

	@Before
	public void setUp() {
		nb = new Nedbør();
	}

	@Test
	public void testBedsteTreFerieUger() {
		assertEquals(30, nb.besteTreFerieUger(nedbørPrUge));
	}

	@Test
	public void testBedsteFerieUgeStart() {
		assertEquals(23, nb.bedsteFerieUgerStart(nedbørPrUge, 6));
	}

	@Test
	public void testMestEnsNedboer() {
		assertEquals(43, nb.mestEnsNedboer(nedbørPrUge));
	}
}
