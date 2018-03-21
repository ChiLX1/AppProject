package com.mycompany.intent2app;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	public EditText first_et;
	public Button first_bt;
	public TextView first_tv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		first_et = (EditText) findViewById(R.id.firstEditText);
		first_bt = (Button) findViewById(R.id.firstButton);
		first_tv = (TextView) findViewById(R.id.firstTextView);
		
		first_bt.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent intent = new Intent(MainActivity.this,Second.class);
					intent.putExtra("first",first_et.getText().toString().trim());
					startActivityForResult(intent,1);
				}
				
			
		});
		
		
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		// TODO: Implement this method
		super.onActivityResult(requestCode, resultCode, data);
		
		switch(requestCode){
			case 1:
				if(resultCode == RESULT_OK){
					first_tv.setText(data.getStringExtra("second"));
				}
				
				break;
		}
	}
	
	
}
