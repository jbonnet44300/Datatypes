/**
 * @(#) Conversion.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.mesures;

public class Conversion
{
	private Unite uniteSortante = new Unite();
	
	private double coefficient = 1;
	
	public void setUniteSortante( Unite uniteSortante )
	{
		this.uniteSortante=uniteSortante;
	}
	
	public Unite getUniteSortante( )
	{
		return uniteSortante;
	}
	
	public void setCoefficient( double coefficient )
	{
		this.coefficient=coefficient;
	}
	
	public double getCoefficient( )
	{
		return coefficient;
	}
	
	
}
