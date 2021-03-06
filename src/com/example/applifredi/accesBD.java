package com.example.applifredi;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class accesBD{
	
	private BdSQLiteOpenHelper accessBDD;
	private SQLiteDatabase bdd;
	
	public accesBD(Context context){
		accessBDD = new BdSQLiteOpenHelper(context,"bddtest",null,1);
		
	}
	
	public void open() throws SQLException {
		bdd = accessBDD.getWritableDatabase();
	}
	
	public void close() {
		// Cette ligne permet d'effacer le contenu de la table association.
		// A utiliser uniquement pour debug.
		// "TRUNCATE TABLE" n'existe pas sous SQLite (d'où DELETE FROM sans WHERE)
		//bdd.execSQL("DELETE FROM association;");
		accessBDD.close();
	}
	
	public void addUtilisateur(accesseursUtilisateur unAccesBD){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req="INSERT INTO utilisateur(nom,prenom,adresse)" +
				" VALUES('"+unAccesBD.getNom()+"'" +
				", '"+unAccesBD.getPrenom()+"'"+",'"+unAccesBD.getAdresse()+"');";
		
		Log.d("Messages",req);
		bdd.execSQL(req);
		bdd.close();
	}

	public accesseursUtilisateur getUtilisateur(){
		accesseursUtilisateur unAccesBD = null;
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM utilisateur",null);
		if(curseur.getCount()>0){
			curseur.moveToFirst();
			unAccesBD = new accesseursUtilisateur(curseur.getString(0),curseur.getString(1),curseur.getString(2));
			
		}
	
		return unAccesBD;
	}

        public void addDeplacement(classedeplacement unAccesBD){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req="INSERT INTO deplacement()" +
				" VALUES('"+unAccesBD.getAssociation()+"'" +
				", '"+unAccesBD.getDate()+"'"+",'"+unAccesBD.getMotif()+"'"+",'"+unAccesBD.getTitreTrajet()+"'"+",'"+unAccesBD.getNbKm()+"'"+",'"+unAccesBD.getMontantPeage()+"'"+",'"+unAccesBD.getNbRepas()+"'"+",'"+unAccesBD.getNbNuitee()+"');";
		
		Log.d("Messages",req);
		bdd.execSQL(req);
		bdd.close();
	}

        public void modifDeplacement(classedeplacement unAccesBD){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req="UPDATE deplacement()" +
				" SET('"+unAccesBD.getAssociation()+"'" +
				", '"+unAccesBD.getDate()+"'"+",'"+unAccesBD.getMotif()+"'"+",'"+unAccesBD.getTitreTrajet()+"'"+",'"+unAccesBD.getNbKm()+"'"+",'"+unAccesBD.getMontantPeage()+"'"+",'"+unAccesBD.getNbRepas()+"'"+",'"+unAccesBD.getNbNuitee()+"');";
		
		Log.d("Messages",req);
		bdd.execSQL(req);
		bdd.close();
	}
	
	
	public classedeplacement getDeplacement(long id) {
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM deplacement WHERE _id = ?", new String[] { String.valueOf(id) });
		classedeplacement deplacement = null;
		if (curseur.getCount() == 1) {
			curseur.moveToFirst();
			deplacement = new classedeplacement(curseur.getString(0),curseur.getString(1),curseur.getString(2),curseur.getString(3),curseur.getDouble(4),curseur.getDouble(5),curseur.getInt(6),curseur.getInt(7));
		}
		curseur.close();
		return deplacement;
	}
	
	public ArrayList<classedeplacement> getDeplacements(){
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM deplacement", null);
		ArrayList<classedeplacement> liste = new ArrayList<classedeplacement>();
		curseur.moveToFirst();
		while(!curseur.isAfterLast()){
			liste.add(new classedeplacement(curseur.getString(0),curseur.getString(1),curseur.getString(2),curseur.getString(3),curseur.getDouble(4),curseur.getDouble(5),curseur.getInt(6),curseur.getInt(7)));
			curseur.moveToNext();
		}		
		curseur.close();
		return liste;
	}
	
	
}
