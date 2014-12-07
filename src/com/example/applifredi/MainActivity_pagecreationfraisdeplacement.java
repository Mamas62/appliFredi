package com.example.applifredi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_pagecreationfraisdeplacement extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_pagecreationfraisdeplacement);
		
		 final Button btnEnregistrer = (Button) findViewById(R.id.btnEnregistrer);
	        btnEnregistrer.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
				
					accesBD manipBDD = new accesBD(MainActivity_pagecreationfraisdeplacement.this);
					
					EditText edtAsso = (EditText)findViewById(R.id.edtAsso);
		        	EditText edtDate = (EditText)findViewById(R.id.edtDate);
		        	EditText edtMotif = (EditText)findViewById(R.id.edtMotif);
		        	EditText edtTrajet = (EditText)findViewById(R.id.edtTrajet);
		        	EditText edtNbKm = (EditText)findViewById(R.id.edtNbKm);
		        	EditText edtPeage = (EditText)findViewById(R.id.edtPeage);
		        	EditText edtRepas = (EditText)findViewById(R.id.edtRepas);
		        	EditText edtNuitee = (EditText)findViewById(R.id.edtNuitee);
					
		        	classedeplacement deplacement = new classedeplacement(edtAsso.getText().toString(),edtDate.getText().toString(),edtMotif.getText().toString(),edtTrajet.getText().toString(),Double.parseDouble(edtNbKm.getText().toString()),Double.parseDouble(edtPeage.getText().toString()),Integer.parseInt(edtRepas.getText().toString()),Integer.parseInt(edtNuitee.getText().toString()));
				}
	        	
	        	
	        });
	        }
	}


