/**
 * @(#) Devise.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.financier;

import java.util.ArrayList;

public class Devise
{
	private String codeInterne = "FRA";
	
	private ArrayList<TauxFinancier> taux = new ArrayList<TauxFinancier>();
	
	public void setCodeInterne( String codeInterne )
	{
		this.codeInterne=codeInterne;
	}
	
	public String getCodeInterne( )
	{
		return codeInterne;
	}
	
	public void setTaux( TauxFinancier taux )
	{
		this.taux.add(taux);
	}
	
	public ArrayList<TauxFinancier> getTaux( )
	{
		return taux;
	}
	
	
}
