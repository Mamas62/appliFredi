package com.example.applifredi;

public class accesseurs {

	private double id;
	private String nom, prenom, adresse;
	
	public accesseurs(String nom,String prenom,String adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	// ACCESEURS
	
	public double getId(){	
		return this.id;	
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom(){
		return this.prenom;
	}

	public String getAdresse(){
		return this.adresse;
	}
	
	// MODIFICATEURS
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;		
	}
	
	public void setAdresse(String adresse){
		this.adresse = adresse;
	}
	

}
