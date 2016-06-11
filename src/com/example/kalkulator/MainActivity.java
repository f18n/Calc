package com.example.kalkulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends Activity {
	
	Button check;
	EditText et1,et2,et3;
	Spinner sp;

	String apa[] = {"+","-",":","x"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = (Button) findViewById(R.id.button1);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        sp = (Spinner) findViewById(R.id.spinner1);
        
		ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,apa);
        sp.setAdapter(aa);
        //add function
        check.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a = et1.getText().toString();
				String b = et2.getText().toString();
				int value1 = Integer.parseInt(a);
				int value2 = Integer.parseInt(b);
				int aa = sp.getSelectedItemPosition();
				switch(aa){
				case 0:
					et3.setText(Integer.toString(value1+value2));break;
				case 1:
					et3.setText(Integer.toString(value1-value2));break;
				case 2:
					et3.setText(Integer.toString(value1/value2));break;
				case 3:
					et3.setText(Integer.toString(value1*value2));break;
					default:
				}
			}
		});
        
        
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
