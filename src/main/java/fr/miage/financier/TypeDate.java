/**
 * @(#) Date.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.financier;

import java.util.GregorianCalendar;

public class TypeDate
{
	private Integer jour = 1;
	
	private Integer mois = 1;
	
	private Integer annee = 1000;
	
	private Horaire horaire = new Horaire();
	
	public void setJour( Integer jour )
	{
		this.jour=jour;
	}
	
	public Integer getJour( )
	{
		return jour;
	}
	
	public void setMois( Integer mois )
	{
		this.mois=mois;
	}
	
	public Integer getMois( )
	{
		return mois;
	}
	
	public void setAnnee( Integer annee )
	{
		this.annee=annee;
	}
	
	public Integer getAnnee( )
	{
		return annee;
	}
	
	public void setHoraire( Horaire horaire )
	{
		this.horaire=horaire;
	}
	
	public Horaire getHoraire( )
	{
		return horaire;
	}
	
	public Boolean anneeBisextile( )
	{
		GregorianCalendar gcal = new GregorianCalendar();
		Boolean bool = gcal.isLeapYear(this.annee);
		return bool;
	}
	
	
}
