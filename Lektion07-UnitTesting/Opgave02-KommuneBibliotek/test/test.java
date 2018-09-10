package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import model.Bibliotek;

public class test {
	Bibliotek bib;

	@Before
	public void setUp() {
		bib = new Bibliotek();
	}

	@Test(expected = RuntimeException.class)
	public void testBeregnBødeException() {
		assertEquals(-1, bib.beregnBøde(LocalDate.now(), LocalDate.now(), false));
		assertEquals(-1, bib.beregnBøde(LocalDate.now(), LocalDate.now().minusDays(1), false));
	}

	@Test
	public void testBeregnBøde() {
		assertEquals(10, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(1), false));
		assertEquals(30, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(8), false));
		assertEquals(45, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(15), false));
		assertEquals(20, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(1), true));
		assertEquals(60, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(8), true));
		assertEquals(90, bib.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(15), true));
	}
}
