/**
 * @(#) Evenement.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.temporel;
import fr.miage.financier.TypeDate;

public class Evenement
{
	private TypeDate dateEvent = new TypeDate();
	
	private String nom = "";
	
	private Duree dureeEvent = new Duree();
	
	private Delai delaiRepet = new Delai();
	
	private Intervalle periodeRepet = new Intervalle();
	
	public void setDateEvent( TypeDate dateEvent )
	{
		this.dateEvent=dateEvent;
	}
	
	public TypeDate getDateEvent( )
	{
		return dateEvent;
	}
	
	public void setNom( String nom )
	{
		this.nom=nom;
	}
	
	public String getNom( )
	{
		return nom;
	}
	
	public void setDureeEvent( Duree dureeEvent )
	{
		this.dureeEvent=dureeEvent;
	}
	
	public Duree getDureeEvent( )
	{
		return dureeEvent;
	}
	
	public void setDelaiRepet( Delai delaiRepet )
	{
		this.delaiRepet=delaiRepet;
	}
	
	public Delai getDelaRepetitioniEvent( )
	{
		return delaiRepet;
	}
	
	public void setPeriodeRepet( Intervalle periodeRepet )
	{
		this.periodeRepet=periodeRepet;
	}
	
	public Intervalle getPeriodeRepet( )
	{
		return periodeRepet;
	}
	
	
}
