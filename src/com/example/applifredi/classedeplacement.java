package com.example.applifredi;

import java.sql.Date;

import android.R.string;

public class classedeplacement {
	
	private String association, motif,titreTrajet;
	private double nbKm,montantPeage;
	private int nbRepas,nbNuites,jour,mois,annee;
	
	public classedeplacement (String association,String Motif,String titreTrajet,Double nbKm,Double montantPeage,Integer nbRepas,Integer nbNuites,Integer jour,Integer mois,Integer annee){
	this.association= association;
	this.jour=jour;
	this.mois=mois;
	this.annee=annee;
	this.motif= Motif;
	this.titreTrajet= titreTrajet;
	this.nbKm=nbKm;
	this.montantPeage=montantPeage;
	this.nbRepas= nbRepas;
	this.nbNuites=nbNuites;
		
	}
	
	public String getAssociation() {
		return this.association;
		
	}
    public int getJour(){
    	return this.jour;
    }
    public int getMois(){
    	return this.mois;
    }
    public int getAnnee(){
    	return this.annee;
    }
    public String getMotif (){
    	return this.motif;
    }
    public String getTitreTrajet (){
    	return this.titreTrajet;
    }
    public Double getNbKm(){
    	return this.nbKm;
    }
    public Double getMontantPeage(){
    	return this.montantPeage;
    }
    public Integer getNbRepas(){
    	return this.nbRepas;
    }
    public Integer getNbNuitee(){
    	return this.nbNuites;
    }
    //Modificateurs 
    public void setAssociation(String association){
    	this.association=association;
    }
    public void setMotif (String motif){
    	this.motif=motif;
    }
    public void setTitreTrajet (String TitreTrajet){
    	this.titreTrajet=TitreTrajet;
    }
    public void setNbKm (double NbKm){
    	this.nbKm=NbKm;
    }
    public void setPeage(double peage){
    	this.montantPeage=peage;
    }
    public void setRepas (int repas){
    	this.nbRepas=repas;
    }
    public void setNuites (int nuit){
    	this.nbNuites=nuit;
    }
    public void setJour (int jour){
    	this.jour=jour;
    }
    public void setMois (int mois){
    	this.mois=mois;
    }
    public void setAnnee (int annee){
    	this.annee=annee;
    }
}
