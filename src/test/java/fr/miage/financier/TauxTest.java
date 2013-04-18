package fr.miage.financier;

import fr.miage.financier.TauxFinancier;
import junit.framework.TestCase;

public class TauxTest extends TestCase {

	public void testSpread() {
		TauxFinancier t = new TauxFinancier();
		t.setAchat(1.20);
		t.setVente(1.00);
		double spreadExpected = t.getAchat()-t.getVente();
		assertTrue(Double.compare(spreadExpected, t.spread())==0);
		spreadExpected = 0.4;
		assertFalse(Double.compare(spreadExpected, t.spread())==0);
		
		t.setAchat(1.00);
		t.setVente(1.20);
		spreadExpected = t.getVente() - t.getAchat();
		assertTrue(Double.compare(spreadExpected, t.spread())==0);
		spreadExpected = 0.2;
		assertFalse(Double.compare(spreadExpected, t.spread())==0);
	}

}
