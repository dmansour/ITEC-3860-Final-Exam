package com.example.itec3860finalexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ColorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);
		
		Button getUserColor = (Button) findViewById(R.id.enter_favorite_color);
		final EditText color = (EditText) findViewById(R.id.userFavoriteColor2);
		getUserColor.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Toast toast = Toast.makeText(getApplicationContext(),
						"So your favorite color is " + color.getText().toString() + " huh? Well...that color not bad!", Toast.LENGTH_SHORT);
				toast.show();
			}
			
		});
				
	}

}
