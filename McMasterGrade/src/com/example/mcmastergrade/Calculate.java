package com.example.mcmastergrade;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Calculate extends Activity {

	int i;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		i = 1;
		LinearLayout myLayout;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_convert);
		
		Intent i = getIntent();
		
		
		myLayout =(LinearLayout) findViewById(R.id.linearLayout);
		
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		myLayout.setOrientation(LinearLayout.VERTICAL);
		
		
		
        Button add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v){
        		
        		EditText editText = new EditText(Calculate.this);
        		editText.setId(editText.generateViewId());
        		editText.setHeight(50);
        		editText.setHint("Grade");
        	}
        }
        
        		);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.convert, menu);
		return true;
	}

}
