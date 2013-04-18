package fr.miage.financier;

import fr.miage.financier.TypeDate;
import junit.framework.TestCase;

public class DateTest extends TestCase {

	public void testAnneeBisextile() {
		TypeDate d = new TypeDate();
		d.setAnnee(1999);
		assertFalse(d.anneeBisextile());
		d.setAnnee(2016);
		assertTrue(d.anneeBisextile());
	}

}
