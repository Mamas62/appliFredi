package com.example.applifredi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class passageVueVersHistorique extends Activity {
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_historique);
        
        final Button btnModifications = (Button) findViewById(R.id.btnModifications);
        btnModifications.setOnClickListener(new View.OnClickListener() {
        	
        @Override
        public void onClick(View v) {
        	       	
        	Intent intent = new Intent(passageVueVersHistorique.this, passageHistoriqueaModif.class);
          startActivity(intent);
          }
        });
        
    }
  
}