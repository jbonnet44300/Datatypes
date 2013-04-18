/**
 * @(#) Ville.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

public class Ville
{
	private PaysAdresse paysAssocie = new PaysAdresse();
	
	private String nomVille = "";
	
	private float latitudeVille = 0;
	
	private float longitudeVille = 0;
	
	public void setPaysAssocie( PaysAdresse paysAssocie )
	{
		this.paysAssocie=paysAssocie;
	}
	
	public PaysAdresse getPaysAssocie( )
	{
		return paysAssocie;
	}
	
	public void setNomVille( String nomVille )
	{
		this.nomVille=nomVille;
	}
	
	public String getNomVille( )
	{
		return nomVille;
	}
	
	public void setLatitudeVille( float latitudeVille )
	{
		this.latitudeVille=latitudeVille;
	}
	
	public float getLatitudeVille( )
	{
		return latitudeVille;
	}
	
	public void setLongitudeVille( float longitudeVille )
	{
		this.longitudeVille=longitudeVille;
	}
	
	public float getLongitudeVille( )
	{
		return longitudeVille;
	}
	
	public Boolean estDansMemePays( Ville ville2 )
	{
		if(ville2.paysAssocie.egale(this.paysAssocie)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Method equals overload
	 */
	public Boolean egale(Ville ville)
	{
		return this.latitudeVille == ville.latitudeVille && 
				this.longitudeVille == ville.longitudeVille &&
				this.nomVille == ville.nomVille &&
				this.paysAssocie.egale(ville.paysAssocie);
	}
	
	
}
