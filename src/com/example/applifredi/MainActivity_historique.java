package com.example.applifredi;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity_historique extends Activity {
	
	//attributs
	private accesBD manipBDD = null; //permet l'acc�s � la BDD
	private ArrayAdapter<String> listeAdapter = null; //adaptateur liste affichage avec liste layout
	private ArrayList<classedeplacement> listeDeplacements = null;
	private ArrayList<String> listeDeplacementsAffiches = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_historique);
		
		manipBDD = new accesBD(this);
		ArrayList<classedeplacement> deplacements = manipBDD.getDeplacements();
		
		
		
		// Initialisation de la liste d'affichage, mise � jour de son contenu, affichage et param�trage menu contextuel
				ListView listViewAssociations = (ListView)findViewById(R.id.listViewAssociations);//r�cup�ration de la lite du layout
				miseAJourListe();
				listeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeDeplacementsAffiches);//fais le lien entre liste layout et liste affichage
				listViewAssociations.setAdapter(listeAdapter);//defini l'adaptateur de la liste
	}
	
	private void miseAJourListe() {
		// On r�cup�re toutes les associations et on pr�pare la liste d'affichage
		listeDeplacements = manipBDD.getDeplacements();
		for (classedeplacement unDeplacement : listeDeplacements)
			listeDeplacementsAffiches.add(unDeplacement.getTitreTrajet());
	}
}
