package fr.miage.adresses;

import fr.miage.adresses.Personne;
import junit.framework.TestCase;

public class PersonneTest extends TestCase {

	public void testEstMajeur() {
		Personne p1 = new Personne();
		p1.setDateNaiss("20121989");
		assertTrue(p1.estMajeur());
		
		p1.setDateNaiss("20122000");
		assertFalse(p1.estMajeur());
	}

}
