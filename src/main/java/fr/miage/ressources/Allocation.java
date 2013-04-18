/**
 * @(#) Allocation.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.ressources;

import java.util.ArrayList;

import fr.miage.financier.TypeDate;

public class Allocation
{
	private TypeDate debut = new TypeDate();
	
	private TypeDate fin = new TypeDate();
	
	private ArrayList<Ressource> ressource = new ArrayList<Ressource>();
	
	private TypeUtilisation typeUtilisation = new TypeUtilisation();
	
	public void setDebut( TypeDate debut )
	{
		this.debut=debut;
	}
	
	public TypeDate getDebut( )
	{
		return debut;
	}
	
	public void setFin( TypeDate fin )
	{
		this.fin=fin;
	}
	
	public TypeDate getFin( )
	{
		return fin;
	}
	
	public void setRessource( Ressource ressource )
	{
		this.ressource.add(ressource);
	}
	
	public ArrayList<Ressource> getRessource( )
	{
		return ressource;
	}
	
	public void setTypeUtilisation( TypeUtilisation typeUtilisation )
	{
		this.typeUtilisation=typeUtilisation;
	}
	
	public TypeUtilisation getTypeUtilisation( )
	{
		return typeUtilisation;
	}
	
	
}
