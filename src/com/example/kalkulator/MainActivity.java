package com.example.kalkulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	
	Button btnbagi,btntambah,btnkali,btnkurang;
	EditText et1,et2,et3;
	TextView jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnbagi = (Button) findViewById(R.id.btnbagi);
        btntambah = (Button) findViewById(R.id.btntambah);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        
        btnbagi.setOnClickListener(this);
        btnkali.setOnClickListener(this);
        btnkurang.setOnClickListener(this);
        btntambah.setOnClickListener(this);
        
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        
        jumlah = (TextView) findViewById(R.id.txthasil);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int nilai1 = Integer.parseInt(et1.getText().toString());
		int nilai2 = Integer.parseInt(et2.getText().toString());
		switch (v.getId()) {
		case R.id.btntambah:
			jumlah.setText(Integer.toString(nilai1+nilai2));
			break;
		case R.id.btnkurang:
			jumlah.setText(Integer.toString(nilai1-nilai2));
			break;
		case R.id.btnkali:
			jumlah.setText(Integer.toString(nilai1*nilai2));
			break;
		case R.id.btnbagi:
			jumlah.setText(Integer.toString(nilai1/nilai2));
			break;
		default:
			break;
	}
		
	}
}
