package com.example.applifredi;

public class constructeurs {

	private long id;
	private String nom, prenom, adresse;
	
	public constructeurs(long id,String nom,String prenom,String adresse){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public long getId(){
	
	return this.id;
	
	}
	public void setId(long id){
		this.id = id;
	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
		
	}
	public String getAdresse(){
		return this.adresse;
	}
	public void setAdresse(String adresse){
		this.adresse = adresse;
	}
	

}
