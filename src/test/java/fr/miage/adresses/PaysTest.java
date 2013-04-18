package fr.miage.adresses;

import fr.miage.adresses.PaysAdresse;
import junit.framework.TestCase;

public class PaysTest extends TestCase {

	public void testEqualsPays() {
		PaysAdresse p1 = new PaysAdresse();
		PaysAdresse p2 = new PaysAdresse();
		
		assertTrue(p1.egale(p1));
		
		p1.setNomPays("France");
		p2.setNomPays("France");
		assertTrue(p1.egale(p1));
		
		p2.setNbNumTel(10);
		assertFalse(p1.egale(p2));
		
	}

}
