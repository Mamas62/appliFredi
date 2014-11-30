package com.example.applifredi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class accesBD{
	
	private BdSQLiteOpenHelper accessBDD;
	
	public accesBD(Context context){
		accessBDD = new BdSQLiteOpenHelper(context,"bddtest",null,1);
		
	}
	public void addViticulteur1(constructeurs unAccesBD){
		SQLiteDatabase bdd = accessBDD.getWritableDatabase();
		String req="INSERT INTO utilisateur(nom,prenom,adresse)" +
				" VALUES('"+unAccesBD.getNom()+"'" +
				", '"+unAccesBD.getPrenom()+"'"+",'"+unAccesBD.getAdresse()+"');";
		
		Log.d("Messages",req);
		bdd.execSQL(req);
		bdd.close();
	}

	public constructeurs getUtilisateur(){
		constructeurs unAccesBD = null;
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM utilisateur",null);
		if(curseur.getCount()>0){
			curseur.moveToFirst();
			unAccesBD = new constructeurs(curseur.getLong(0),curseur.getString(1),curseur.getString(2),curseur.getString(3));
			
		}
	
		return unAccesBD;
	}
	
	
}