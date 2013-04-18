/**
 * @(#) Mesure.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.mesures;

public class Mesure
{
	private double quantite = 1;
	
	private Unite unite = new Unite();
	
	public void setQuantite( double quantite )
	{
		this.quantite=quantite;
	}
	
	public double getQuantite( )
	{
		return quantite;
	}
	
	public void setUnite( Unite unite )
	{
		this.unite=unite;
	}
	
	public Unite getUnite( )
	{
		return unite;
	}
	
	public Mesure convertir( Unite uniteSortante )
	{
		Mesure mesureConvertie = new Mesure();
		for(Conversion conv : this.unite.getConversion()){
			if(conv.getUniteSortante() == uniteSortante){
				mesureConvertie.setUnite(uniteSortante);
				mesureConvertie.setQuantite(quantite * conv.getCoefficient());
			}
		}
		return mesureConvertie;
	}
	
	
}
