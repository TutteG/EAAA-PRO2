package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {
	public Bibliotek() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returnerer størrelsen af bøden beregnet i henhold til skemaet* ovenfor *
	 * krav: beregnetDato < faktiskDato* (beregnetDato er forventet afleveringsdato
	 * og* faktiskDato er den dag bogen blev afleveret; voksen er* sand, hvis det er
	 * en voksen og falsk ellers)
	 */
	public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
		int bøde = -1;
		if (beregnetDato.isAfter(faktiskDato) || beregnetDato.isEqual(faktiskDato)) {
			throw new RuntimeException("Bogen er ikke for sent afleveret");
		} else {
			int daysBetween = (int) ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
			if (voksen) {
				if (daysBetween > 14) {
					bøde = 90;
				} else if (daysBetween >= 7) {
					bøde = 60;
				} else {
					bøde = 20;
				}
			}
			if (!voksen) {
				if (daysBetween > 14) {
					bøde = 45;
				} else if (daysBetween >= 7) {
					bøde = 30;
				} else {
					bøde = 10;
				}
			}
			return bøde;
		}
	}
}
