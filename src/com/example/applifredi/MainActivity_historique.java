package com.example.applifredi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_historique extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_historique);
		
		accesBD manipBDD = new accesBD(this);
		classedeplacement deplacement = manipBDD.getDeplacement(1);
		
		TextView txtTest = (TextView)findViewById(R.id.txtTest);
		txtTest.setText(deplacement.getTitreTrajet());
	}
}
