package com.mycompany.renpinapp;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	public EditText et;
	public Button bt;
	public TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
	    et = (EditText) findViewById(R.id.mainEditText);
	    bt = (Button) findViewById(R.id.mainButton);
		
		LayoutInflater layout = this.getLayoutInflater();
		View view = layout.inflate(R.layout.cal_activity,null);
		  tv = (TextView) view.findViewById(R.id.name);
		
		
		
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
