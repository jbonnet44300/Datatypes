/**
 * @(#) Intervalle.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.temporel;

public class Intervalle
{
	private TypePeriode periode = new TypePeriode();
	
	public void setPeriode( TypePeriode periode )
	{
		this.periode=periode;
	}
	
	public TypePeriode getPeriode( )
	{
		return periode;
	}
	
	
}
