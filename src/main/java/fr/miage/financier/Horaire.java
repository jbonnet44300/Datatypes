/**
 * @(#) Devise.java
 * @author : Justine
 * @licence : Apache Licence 2.0
 * @date : 17/04/2013
 * @revision : 1.0
 */

package fr.miage.financier;

public class Horaire
{
		private Integer heure = 0;
		
		private Integer minute = 0;
		
		private Integer seconde = 0;
		
		public void setHeure( Integer heure )
		{
			this.heure = heure;
		}
		
		public void setMinute( Integer minute )
		{
			this.minute = minute;
		}
		
		public void setSeconde( Integer seconde )
		{
			this.seconde = seconde;
		}
		
		public Integer getHeure( )
		{
			return this.heure;
		}
		
		public Integer getMinute( )
		{
			return this.minute;
		}
		
		public Integer getSeconde( )
		{
			return this.seconde;
		}
		
		public Boolean matin( )
		{
			if( this.heure >= 0 && this.heure < 12 ){
				return true;
			}
			else{
				return false;
			}
		}
		
		public Boolean apresMidi( )
		{
			if(this.matin()){
				return false;
			}
			else{
				return true;
			}
		}
}
