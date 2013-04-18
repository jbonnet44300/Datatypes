package fr.miage.adresses;

import fr.miage.adresses.Ville;
import fr.miage.adresses.PaysAdresse;
import junit.framework.TestCase;

public class VilleTest extends TestCase {

	public void testEstDansMemePays() {
		Ville v1 = new Ville();
		Ville v2 = new Ville();
		PaysAdresse p1 = new PaysAdresse();
		PaysAdresse p2 = new PaysAdresse();
		p1.setNomPays("France");
		p2.setNomPays("Etats-Unis");
		
		assertTrue(v1.estDansMemePays(v1));
		assertTrue(v1.estDansMemePays(v2));
		
		v1.setPaysAssocie(p1);
		v2.setPaysAssocie(p1);
		assertTrue(v1.estDansMemePays(v1));
		assertTrue(v1.estDansMemePays(v2));
		
		v2.setPaysAssocie(p2);
		assertFalse(v1.estDansMemePays(v2));
		
	}

	public void testEqualsVille() {
		Ville v1 = new Ville();
		Ville v2 = new Ville();
		
		assertTrue(v1.egale(v1));
		assertTrue(v1.egale(v2));
		
		v1.setNomVille("Nantes");
		v2.setNomVille("Nantes");
		assertTrue(v1.egale(v2));
		v2.setNomVille("Saint-Herblain");
		assertFalse(v1.egale(v2));
	}

}
