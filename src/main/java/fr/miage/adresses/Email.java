/**
 * @(#) Email.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

public class Email
{
	private String identifiant = "";
	
	private String domaine = "";
	
	public void setIdentifiant( String identifiant )
	{
		this.identifiant=identifiant;
	}
	
	public String getIdentifiant( )
	{
		return identifiant;
	}
	
	public void setDomaine( String domaine )
	{
		this.domaine=domaine;
	}
	
	public String getDomaine( )
	{
		return domaine;
	}
	
	
}
