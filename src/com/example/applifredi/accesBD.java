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
	
	public classedeplacement getDeplacement(long id){
		classedeplacement unAccesBD = null;
		Cursor curseur = accessBDD.getReadableDatabase().rawQuery("SELECT * FROM deplacement WHERE _id = ?", new String[] {String.valueOf(id)});
		if(curseur.getCount()>0){
			curseur.moveToFirst();
			unAccesBD = new classedeplacement(curseur.getString(0),curseur.getString(1),curseur.getString(2),curseur.getDouble(3),curseur.getDouble(4),curseur.getInt(5),curseur.getInt(6),curseur.getInt(7),curseur.getInt(8),curseur.getInt(9));
			
		}
	
		return unAccesBD;
	}
	
	
}