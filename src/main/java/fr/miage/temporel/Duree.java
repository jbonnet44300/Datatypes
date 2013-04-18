/**
 * @(#) Duree.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.temporel;

public class Duree
{
	private Integer nbheures = 0;
	
	private Integer nbminutes = 0;
	
	private Integer nbsecondes = 0;
	
	public void setNbheures( Integer nbheures )
	{
		this.nbheures=nbheures;
	}
	
	public Integer getNbheures( )
	{
		return nbheures;
	}
	
	public void setNbminutes( Integer nbminutes )
	{
		this.nbminutes=nbminutes;
	}
	
	public Integer getNbminutes( )
	{
		return nbminutes;
	}
	
	public void setNbsecondes( Integer nbsecondes )
	{
		this.nbsecondes=nbsecondes;
	}
	
	public Integer getNbsecondes( )
	{
		return nbsecondes;
	}
	
	
}
