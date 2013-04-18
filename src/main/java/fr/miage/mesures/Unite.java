/**
 * @(#) Unite.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.mesures;

import java.util.ArrayList;

public class Unite
{
	private String nom = "";
	
	private ArrayList<Conversion> conversion = new ArrayList<Conversion>();
	
	public void setNom( String nom )
	{
		this.nom=nom;
	}
	
	public String getNom( )
	{
		return nom;
	}
	
	public void setConversion( Conversion conversion )
	{
		this.conversion.add(conversion);
	}
	
	public ArrayList<Conversion> getConversion( )
	{
		return conversion;
	}
	
	
}
