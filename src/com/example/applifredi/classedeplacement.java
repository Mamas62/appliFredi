package com.example.applifredi;

public class classedeplacement {
	
	private String association, motif,titreTrajet,date;
	private double nbKm,montantPeage;
	private int nbRepas,nbNuites;
	
	public classedeplacement (String association,String date, String Motif,String titreTrajet,Double nbKm,Double montantPeage,Integer nbRepas,Integer nbNuites){
	this.association= association;
	this.date=date;
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
	public String getDate() {
			return this.date;
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
    public void setDate(String date){
    	this.date=date;
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
  
}
