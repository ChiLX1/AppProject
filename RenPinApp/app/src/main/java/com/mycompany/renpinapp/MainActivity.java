package com.mycompany.renpinapp;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.widget.CompoundButton.*;

public class MainActivity extends Activity 
{
	public EditText et;
	public Button bt;
	public TextView tv;
	public RadioGroup rg_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
	    et = (EditText) findViewById(R.id.mainEditText);
	    bt = (Button) findViewById(R.id.mainButton);
		rg_bt = (RadioGroup) findViewById(R.id.mainRadioGroup);
		
		rg_bt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(RadioGroup p1, int p2)
				{
					// TODO: Implement this method
					p2 = p1.getCheckedRadioButtonId();
					switch(p2){
						case R.id.manRadioButton:
							Toast.makeText(MainActivity.this,"man",Toast.LENGTH_SHORT).show();
							break;
					}
				}
				

				

			
		});
	
		
		
		bt.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					Intent intent = new Intent(MainActivity.this,Cal_Activity.class);
					intent.putExtra("name",et.getText().toString().trim());
					startActivity(intent);
					
					
				}
				
			
		});
    }
}
