/**
 * @(#) Taux.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.financier;

import java.util.ArrayList;

public class TauxFinancier
{
	private double achat = 1;
	
	private double vente = 1;
	
	private Devise deviseSortante = new Devise();
	
	private ArrayList<TypeDate> date = new ArrayList<TypeDate>();
	
	public void setAchat( double achat )
	{
		this.achat=achat;
	}
	
	public double getAchat( )
	{
		return achat;
	}
	
	public void setVente( double vente )
	{
		this.vente=vente;
	}
	
	public double getVente( )
	{
		return vente;
	}
	
	public void setDeviseSortante( Devise deviseSortante )
	{
		this.deviseSortante=deviseSortante;
	}
	
	public Devise getDeviseSortante( )
	{
		return deviseSortante;
	}
	
	public void setDate( TypeDate date )
	{
		this.date.add(date);
	}
	
	public ArrayList<TypeDate> getDate( )
	{
		return date;
	}
	
	public double spread( )
	{
		double spread;
		if( Double.compare(achat-vente,0) >= 0 ){
			spread = achat-vente;
		}
		else{
			spread = vente-achat;
		}
		return spread;
	}
	
	
}
