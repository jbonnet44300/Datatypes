package fr.miage.adresses;

import fr.miage.adresses.Adresse;
import fr.miage.adresses.PaysAdresse;
import fr.miage.adresses.Ville;
import fr.miage.adresses.Telephone;
import junit.framework.TestCase;

public class TelephoneTest extends TestCase {

	public void testTelValide() {
		Personne p = new Personne();
		Adresse a = new Adresse();
		Ville v = new Ville();
		PaysAdresse pays = new PaysAdresse();
		pays.setNomPays("France");
		pays.setNbNumTel(10);
		pays.setIndicatifTel(33);
		v.setPaysAssocie(pays);
		a.setVilleAssociee(v);
		p.setAdresseAssociee(a);
		Telephone t = new Telephone();
		t.setIndicatifTel(33);
		assertTrue(t.telValide(p));
		
		Telephone t2 = new Telephone();
		t2.setIndicatifTel(22);
		assertFalse(t2.telValide(p));
	}

}
