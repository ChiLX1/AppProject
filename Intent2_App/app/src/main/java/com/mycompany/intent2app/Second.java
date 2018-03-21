package com.mycompany.intent2app;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.View.*;
import android.view.*;

public class Second extends Activity
{
	public EditText second_et;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second);
		
		Button second_bt = (Button) findViewById(R.id.second_Button);
		TextView second_tv = (TextView) findViewById(R.id.second_TextView);
		 second_et = (EditText) findViewById(R.id.second_EditText);
		
		Intent intent = getIntent();
		String result =  intent.getStringExtra("first");
		second_tv.setText(result);
		
		second_bt.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent intent1 = new Intent();
					intent1.putExtra("second",second_et.getText().toString().trim());
					setResult(RESULT_OK,intent1);
					finish();
				}
				
			
		});
	}

	@Override
	public void onBackPressed()
	{
		// TODO: Implement this method
		//super.onBackPressed();
		
		Intent intent1 = new Intent();
		intent1.putExtra("second",second_et.getText().toString().trim());
		setResult(RESULT_OK,intent1);
		finish();
	}
	
	
	
	
}
