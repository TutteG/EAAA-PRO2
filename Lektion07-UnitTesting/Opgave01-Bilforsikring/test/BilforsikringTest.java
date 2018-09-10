package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import forsikring.Bilforsikring;

public class BilforsikringTest {
	Bilforsikring bf;
	final double fejlmargin = 0.001;

	@Before
	public void setUp() throws Exception {
		bf = new Bilforsikring();
		bf.setGrundpræmie(100);
	}

	@Test
	public void testGrundPræmie() {
		bf.setGrundpræmie(100);
		assertEquals(100, bf.getGrundPræmie(), fejlmargin);
	}

	@Test
	public void testBeregnPræmie() {
		assertEquals(125, bf.beregnPræmie(24, false, 0), fejlmargin);
		assertEquals(95, bf.beregnPræmie(25, true, 0), fejlmargin);
		assertEquals(85, bf.beregnPræmie(25, false, 3), fejlmargin);
		assertEquals(75, bf.beregnPræmie(25, false, 6), fejlmargin);
		assertEquals(65, bf.beregnPræmie(29, false, 9), fejlmargin);
	}

	@Test(expected = RuntimeException.class)
	public void testBeregnPræmieExceptions() {
		bf.setGrundpræmie(0);
		assertEquals(125, bf.beregnPræmie(18, false, 0), fejlmargin);
		bf.setGrundpræmie(100);
		assertEquals(125, bf.beregnPræmie(17, false, 0), fejlmargin);
		assertEquals(125, bf.beregnPræmie(18, false, 1), fejlmargin);
		assertEquals(125, bf.beregnPræmie(18, false, -1), fejlmargin);
	}
}
