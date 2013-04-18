/**
 * @(#) Ressource.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.ressources;

public class Ressource
{
	private TypeRessource type = new TypeRessource();
	
	public void setType( TypeRessource type )
	{
		this.type=type;
	}
	
	public TypeRessource getType( )
	{
		return type;
	}
	
	
}
