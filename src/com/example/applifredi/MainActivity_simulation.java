package com.example.applifredi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_simulation extends Activity {
	
	private EditText tarifText = null;
	private EditText editKmEffectues = null;
	private EditText editPeage = null;
	private EditText editRepas = null;
	private EditText editNuitee = null;
	private EditText editResultat = null;
	private Button btnSimulation = null;
	private Button btnNouvelleSimulation = null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_simulation);
		
		tarifText = (EditText)findViewById(R.id.tarifText);
		String tarifString = tarifText.getText().toString();
		final Double tarif = Double.valueOf(tarifString).doubleValue();
		
		editKmEffectues = (EditText)findViewById(R.id.editKmEffectues);
		String kmEffectuesString = editKmEffectues.getText().toString();
		final Double kmEffectues = Double.valueOf(kmEffectuesString).doubleValue();
		
		editPeage = (EditText)findViewById(R.id.editPeage);
		String peageString = editPeage.getText().toString();
		final Double peage = Double.valueOf(peageString).doubleValue();
		
		editRepas = (EditText)findViewById(R.id.editRepas);
		String repasString = editRepas.getText().toString();
		final Double repas = Double.valueOf(repasString).doubleValue();
		
		editNuitee = (EditText)findViewById(R.id.editNuitee);
		String nuiteeString = editNuitee.getText().toString();
		final Double nuitee = Double.valueOf(nuiteeString).doubleValue();
		
		btnSimulation = (Button)findViewById(R.id.btnSimulation);
		btnSimulation.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Double resultat = tarif*kmEffectues+peage+repas+nuitee;
				String resultatString = resultat.toString();
				editResultat.setText(resultatString);
				
			}
			
			
		});
		
		btnNouvelleSimulation = (Button)findViewById(R.id.btnNouvelleSimulation);
		btnNouvelleSimulation.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tarifText.setText("");
				editKmEffectues.setText("");
				editPeage.setText("");
				editRepas.setText("");
				editNuitee.setText("");
				editResultat.setText("");
				
				
			}
		});
		
		
		
		
	}
}
