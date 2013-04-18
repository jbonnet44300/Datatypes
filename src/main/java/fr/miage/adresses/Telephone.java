/**
 * @(#) Telephone.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

public class Telephone
{
	private String numTel = "1";
	
	private Integer indicatifTel = 1;
	
	public void setNumTel( String numTel )
	{
		this.numTel=numTel;
	}
	
	public String getNumTel( )
	{
		return numTel;
	}
	
	public void setIndicatifTel( Integer indicatifTel )
	{
		this.indicatifTel=indicatifTel;
	}
	
	public Integer getIndicatifTel( )
	{
		return indicatifTel;
	}
	
	public Boolean telValide( Personne personne )
	{
		if(personne.getAdresseAssociee().getVilleAssociee().getPaysAssocie().getIndicatifTel() == this.indicatifTel){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
