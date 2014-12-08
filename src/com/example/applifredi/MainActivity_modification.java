package com.example.applifredi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_modification extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_modification);
		
		 final Button btnModifier = (Button) findViewById(R.id.btnModifier);
		 btnModifier.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v ) {
				// SAUVEGARDER INFOS
	        	accesBD manipBDD = new accesBD(MainActivity_modification.this);
	        	
	        	EditText edtAsso = (EditText)findViewById(R.id.edtAsso);
	        	EditText edtDate = (EditText)findViewById(R.id.edtDate);
	        	EditText edtMotif = (EditText)findViewById(R.id.edtMotif);
	        	EditText edtTrajet = (EditText)findViewById(R.id.edtTrajet);
	        	EditText edtNbKm = (EditText)findViewById(R.id.edtNbKm);
	        	EditText edtPeage = (EditText)findViewById(R.id.edtPeage);
	        	EditText edtRepas = (EditText)findViewById(R.id.edtRepas);
	        	EditText edtNuitee = (EditText)findViewById(R.id.edtNuitee);
	        	
	        	classedeplacement deplacement = new classedeplacement(edtAsso.getText().toString(),edtDate.getText().toString(),edtMotif.getText().toString(),edtTrajet.getText().toString(),Double.parseDouble(edtNbKm.getText().toString()),Double.parseDouble(edtPeage.getText().toString()),Integer.parseInt(edtRepas.getText().toString()),Integer.parseInt(edtNuitee.getText().toString()));

	        	Intent intent = new Intent(MainActivity_modification.this, passageVue.class);
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
