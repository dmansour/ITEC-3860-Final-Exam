package com.example.itec3860finalexam;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Created AlertDialog using code from: 
		//http://stackoverflow.com/questions/2115758/how-to-display-alert-dialog-in-android
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    
	    builder.setTitle("Welcome!");
	    builder.setMessage("Are you feeling happy today?");
	    builder.setPositiveButton("Oh Yeah! I feel AWESOME!", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Great! I am glad to hear that!", Toast.LENGTH_SHORT);
				toast.show();
				
			}
		});
	    builder.setNegativeButton("No! Life is so miserable...", new DialogInterface.OnClickListener() 
	    {
			

			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Sorry to hear that...Running my application will make you feel beter! :)", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
	    		
	    builder.show();
	    
		Button favirotePetButton = (Button) findViewById(R.id.favorite_pet_button);
		favirotePetButton.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MainActivity.this, PetActivity.class);
				MainActivity.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading page...", Toast.LENGTH_SHORT);
				toast.show();
			}
			
		});
		
		Button faviroteColorButton = (Button) findViewById(R.id.favorite_color_button);
		faviroteColorButton.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(MainActivity.this, ColorActivity.class);
				MainActivity.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading page...", Toast.LENGTH_SHORT);
				toast.show();
			}
			
		});

	}
}