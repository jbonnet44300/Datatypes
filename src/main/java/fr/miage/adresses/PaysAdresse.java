/**
 * @(#) Pays.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

public class PaysAdresse
{
	private String nomPays = "";
	
	private Integer indicatifTel = 1;
	
	private Integer nbNumTel = 1;
	
	public void setNomPays( String nomPays )
	{
		this.nomPays=nomPays;
	}
	
	public String getNomPays( )
	{
		return nomPays;
	}
	
	public void setIndicatifTel( Integer indicatifTel )
	{
		this.indicatifTel=indicatifTel;
	}
	
	public Integer getIndicatifTel( )
	{
		return indicatifTel;
	}
	
	public void setNbNumTel( Integer nbNumTel )
	{
		this.nbNumTel=nbNumTel;
	}
	
	public Integer getNbNumTel( )
	{
		return nbNumTel;
	}
	
	/**
	 * Methode equals overload
	 */
	public Boolean egale(PaysAdresse pays)
	{
		return this.indicatifTel == pays.indicatifTel &&
				this.nbNumTel == pays.nbNumTel &&
				this.nomPays == pays.nomPays;
	}
	
	
}
