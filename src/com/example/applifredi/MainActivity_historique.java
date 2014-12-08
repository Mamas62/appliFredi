package com.example.applifredi;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity_historique extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layoutlistViewAssociations.activity_main_activity_historique);
		
		accesBD manipBDD = new accesBD(this);
		ArrayList<classedeplacement> deplacements = manipBDD.getDeplacements();
		
		// Initialisation de la liste d'affichage, mise � jour de son contenu, affichage et param�trage menu contextuel
				ListView listViewAssociations = (ListView)findViewById(R.id.listViewAssociations);
				manipBDD = new accesBD(this);
				miseAJourListe();
				listeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeAssociationsAffichage);
				listViewAssociations.setAdapter(listeAdapter);
				
				private void miseAJourListe() {
					// On r�cup�re toutes les associations et on pr�pare la liste d'affichage
					manipBDD.open();
					listeAssociations = manipBDD.getAllAssociations();
					manipBDD.close();
					for (Association uneAssociation : listeAssociations)
						listeAssociationsAffichage.add(uneAssociation.getNom());
				}
	}
}
