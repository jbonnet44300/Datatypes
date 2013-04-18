/**
 * @(#) Adresse.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.adresses;

public class Adresse
{
	private Ville villeAssociee = new Ville();
	
	private Integer numeroAdresse = 1;
	
	private LieuAdresse typeAdresse = new LieuAdresse();
	
	private String nomAdresse = "";
	
	private Integer codePostal = 1;
	
	private String complementAdresse = "";
	
	public void setVilleAssociee( Ville villeAssociee )
	{
		this.villeAssociee=villeAssociee;
	}
	
	public Ville getVilleAssociee( )
	{
		return villeAssociee;
	}
	
	public void setNumeroAdresse( Integer numeroAdresse )
	{
		this.numeroAdresse=numeroAdresse;
	}
	
	public Integer getNumeroAdresse( )
	{
		return numeroAdresse;
	}
	
	public void setTypeAdresse( LieuAdresse typeAdresse )
	{
		this.typeAdresse=typeAdresse;
	}
	
	public LieuAdresse getTypeAdresse( )
	{
		return typeAdresse;
	}
	
	public void setNomAdresse( String nomAdresse )
	{
		this.nomAdresse=nomAdresse;
	}
	
	public String getNomAdresse( )
	{
		return nomAdresse;
	}
	
	public void setCodePostal( Integer codePostal )
	{
		this.codePostal=codePostal;
	}
	
	public Integer getCodePostal( )
	{
		return codePostal;
	}
	
	public void setComplementAdresse( String complementAdresse )
	{
		this.complementAdresse=complementAdresse;
	}
	
	public String getComplementAdresse( )
	{
		return complementAdresse;
	}
	
	public Boolean estDansMemeVille( Adresse adresse2 )
	{
		if(this.villeAssociee.egale(adresse2.villeAssociee)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
