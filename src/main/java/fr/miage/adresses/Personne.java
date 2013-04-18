/**
 * @(#) Personne.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Personne
{
	private Adresse adresseAssociee = new Adresse();
	
	private ArrayList<Telephone> telephoneAssocie = new ArrayList<Telephone>();
	
	private ArrayList<Email> emailAssocie = new ArrayList<Email>();
	
	private ArrayList<SiteWeb> siteWebAssocie = new ArrayList<SiteWeb>();
	
	private String nom = "";
	
	private String prenom = "";
	
	private String dateNaiss = "01011901";
	
	private SexePersonne sexe;
	
	public void setAdresseAssociee( Adresse adresseAssociee )
	{
		this.adresseAssociee=adresseAssociee;
	}
	
	public Adresse getAdresseAssociee( )
	{
		return adresseAssociee;
	}
	
	public void setTelephoneAssocie( Telephone telephoneAssocie )
	{
		this.telephoneAssocie.add(telephoneAssocie);
	}
	
	public ArrayList<Telephone> getTelephoneAssocie( )
	{
		return telephoneAssocie;
	}
	
	public void setEmailAssocie( Email emailAssocie )
	{
		this.emailAssocie.add(emailAssocie);
	}
	
	public ArrayList<Email> getEmailAssocie( )
	{
		return emailAssocie;
	}
	
	public void setSiteWebAssocie( SiteWeb siteWebAssocie )
	{
		this.siteWebAssocie.add(siteWebAssocie);
	}
	
	public ArrayList<SiteWeb> getSiteWebAssocie( )
	{
		return siteWebAssocie;
	}
	
	public void setNom( String nom )
	{
		this.nom=nom;
	}
	
	public String getNom( )
	{
		return nom;
	}
	
	public void setPrenom( String prenom )
	{
		this.prenom=prenom;
	}
	
	public String getPrenom( )
	{
		return prenom;
	}
	
	public void setDateNaiss( String dateNaiss )
	{
		this.dateNaiss=dateNaiss;
	}
	
	public String getDateNaiss( )
	{
		return dateNaiss;
	}
	
	public void setSexe( SexePersonne sexe )
	{
		this.sexe=sexe;
	}
	
	public SexePersonne getSexe( )
	{
		return sexe;
	}
	
	public Boolean estMajeur( )
	{
		Calendar dateN = new GregorianCalendar(Integer.parseInt(this.dateNaiss.substring(4)),Integer.parseInt(this.dateNaiss.substring(2, 4)), Integer.parseInt(this.dateNaiss.substring(0, 1)));
		Calendar dateCourante = Calendar.getInstance();
		Integer annees = dateCourante.get(Calendar.YEAR) - dateN.get(Calendar.YEAR);
		if(annees >= 18){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
