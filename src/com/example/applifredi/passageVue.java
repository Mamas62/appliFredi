package com.example.applifredi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class passageVue extends Activity {
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_menu);
        
        final Button btnAjouter = (Button) findViewById(R.id.btnAjouterDsmenu);
        btnAjouter.setOnClickListener(new View.OnClickListener() {
        	
        @Override
        public void onClick(View v) {
        	       	
        	Intent intent = new Intent(passageVue.this, passageVueVerspagecreationfraisdeplacement.class);
          startActivity(intent);
          }
        });
    }
 
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }*/
 
}