package com.mycompany.renpinapp;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import java.util.*;

public class Cal_Activity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cal_activity);
		
		
		TextView name1 =  (TextView) findViewById(R.id.name);
		Intent intent =  getIntent();
		name1.setText(intent.getStringExtra("name"));
		
		TextView tv_score= (TextView) findViewById(R.id.score);
		int number = new Random().nextInt(101);
		tv_score.setText(""+number);
		
		TextView tv_text = (TextView) findViewById(R.id.tell);
		
		if(0<number&number<50){
			tv_text.setText("人品不好，要多做好事啊，攒人品啊");
		}else{
			tv_text.setText("人品不错，继续保持啊");
		}
	}
	
}
