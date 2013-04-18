package fr.miage.adresses;

import fr.miage.adresses.Adresse;
import fr.miage.adresses.Ville;
import junit.framework.TestCase;

public class AdresseTest extends TestCase {

	public void testEstDansMemeVille() {
		Adresse ad1 = new Adresse();
		Adresse ad2 = new Adresse();
		
		Ville ville12 = new Ville();
		ville12.setNomVille("Nantes");
		
		Ville ville1 = new Ville();
		ville1.setNomVille("Nantes");
		Ville ville2 = new Ville();
		ville2.setNomVille("Saint-Herblain");
		
		ad1.setVilleAssociee(ville12);
		ad2.setVilleAssociee(ville12);
		Boolean result = ad1.estDansMemeVille(ad2);
		assertTrue(result);
		
		ad1.setVilleAssociee(ville1);
		ad2.setVilleAssociee(ville2);
		result = ad1.estDansMemeVille(ad2);
		assertFalse(result);
		
		ville2.setNomVille("Nantes");
		ad2.setVilleAssociee(ville2);
		result = ad1.estDansMemeVille(ad2);
		assertTrue(result);
	}

}
