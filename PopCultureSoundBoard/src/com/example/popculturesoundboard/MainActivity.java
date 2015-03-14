package com.example.popculturesoundboard;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {
	
	private OnItemSelectedListener itemSelectedListener = new OnItemSelectedListener() {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
			ListView quoteList = (ListView) findViewById(R.id.quotes);
			ArrayList<String> quotes = new ArrayList<String>();
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			quotes.add("Izzz it gut teeeeeth");
			quotes.add("wuut the fuuuuck??");
			int resId = getResources().getIdentifier("wtf", "raw", getPackageName());
			MediaPlayer mp = MediaPlayer.create(MainActivity.this, resId);
			mp.start();
			quoteList.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,quotes));
			
		}
		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Obtain a character
        populateCharacters();
    }
    
    
    public void populateCharacters() {
    	Spinner person = (Spinner) findViewById(R.id.selectChar);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		this, R.array.characters_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        person.setAdapter(adapter);
        person.setOnItemSelectedListener(itemSelectedListener);
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
