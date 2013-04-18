package fr.miage.mesures;

import fr.miage.mesures.Mesure;
import fr.miage.mesures.Unite;
import fr.miage.mesures.Conversion;
import junit.framework.TestCase;

public class MesureTest extends TestCase {

	public void testConvertir() {
		Mesure m = new Mesure();
		Unite u1 = new Unite();
		u1.setNom("cm");
		Unite u2 = new Unite();
		u2.setNom("mm");
		
		Conversion conversion = new Conversion();
		conversion.setUniteSortante(u2);
		conversion.setCoefficient(10);
		
		u1.setConversion(conversion);
		
		m.setQuantite(2.2);
		m.setUnite(u1);
		
		Mesure mesureExpected = new Mesure();
		mesureExpected.setQuantite(22);
		mesureExpected.setUnite(u2);
		
		Mesure result = m.convertir(u2);
		
		assertTrue((mesureExpected.getQuantite() == result.getQuantite()) &&
				mesureExpected.getUnite().getNom() == result.getUnite().getNom());
	}

}
