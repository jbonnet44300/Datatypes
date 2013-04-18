package fr.miage.financier;

import fr.miage.financier.Horaire;
import junit.framework.TestCase;

public class HoraireTest extends TestCase {

	public void testMatin() {
		Horaire h = new Horaire();
		h.setHeure(10);h.setMinute(00);h.setSeconde(00);
		assertTrue(h.matin());
		h.setHeure(12);
		assertFalse(h.matin());
	}

	public void testApresMidi() {
		Horaire h = new Horaire();
		h.setHeure(10);h.setMinute(00);h.setSeconde(00);
		assertFalse(h.apresMidi());
		h.setHeure(12);
		assertTrue(h.apresMidi());
	}

}
