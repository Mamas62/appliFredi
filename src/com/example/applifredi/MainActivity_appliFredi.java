package com.example.applifredi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_appliFredi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_appli_fredi);
        
        final Button btnValider = (Button) findViewById(R.id.btnValider);
        btnValider.setOnClickListener(new View.OnClickListener() {
        	
        @Override
        public void onClick(View v) {
        	
        	// SAUVEGARDER INFOS
        	accesBD manipBDD = new accesBD(MainActivity_appliFredi.this);
        	
        	EditText edtNom = (EditText)findViewById(R.id.nom);
        	EditText edtPrenom = (EditText)findViewById(R.id.prenom);
        	EditText edtAdresse = (EditText)findViewById(R.id.adresse);
        	
        	accesseursUtilisateur utilisateur = new accesseursUtilisateur(edtNom.getText().toString(), edtPrenom.getText().toString(), edtAdresse.getText().toString());
        	manipBDD.addUtilisateur(utilisateur);
        	
        	Intent intent = new Intent(MainActivity_appliFredi.this, passageVue.class);
          startActivity(intent);
          }
        });
        }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}
