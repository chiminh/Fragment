package com.example.fragment;

import com.example.fragmentwithviewpager.ActivityFragmentMain;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityFragment extends FragmentActivity implements OnClickListener{

	android.support.v4.app.FragmentManager fm;
	android.support.v4.app.FragmentTransaction transaction;
	
	FragmentStart fragmentStart;
	Fragment01 fragment01;
	Fragment02 fragment02 ;
	
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			
			
		};
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_fragment);
		
		Button btn = (Button) findViewById(R.id.btn_fragmentstart);
		Button btn01 = (Button) findViewById(R.id.btn_fragment01);
		Button btn02 = (Button) findViewById(R.id.btn_fragment02);
		Button btnother = (Button) findViewById(R.id.button1);
		btnother.setOnClickListener(this);
		
		
		btn.setOnClickListener(this);
		btn01.setOnClickListener(this);
		btn02.setOnClickListener(this);
		
		fm = getSupportFragmentManager();
		transaction = fm.beginTransaction();
		
		fragmentStart = new FragmentStart();
		
		//transaction.add(R.id.placeholder, fragmentStart);
		
//		Fragment fragment =  fm.findFragmentById(R.id.fragment);
		//transaction.add(fragment, "fragment01");
//		transaction.show(fragment);
//		
//		fragment01 = new Fragment01();
//		transaction.add(R.id.placeholder, fragment01);
//		
//		fragment02 = new Fragment02();
//		transaction.add(R.id.placeholder, fragment02);
		
		transaction.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		boolean is = false;
		Fragment newFragment = null;
		if(view.getId() == R.id.btn_fragmentstart){
			newFragment = new FragmentStart();
			
			Bundle args = new Bundle();
			args.putString("Message", "Message from ActivityFragment");
			
			newFragment.setArguments(args);
			//transaction.show(newFragment);
			
			
		}
		else if (view.getId() == R.id.btn_fragment01){
			newFragment= new Fragment01();
			
		}
		else if(view.getId() == R.id.btn_fragment02){
			newFragment = new Fragment02();
			
			
		}
		else{
			is = true;
			Intent i = new Intent(ActivityFragment.this, ActivityFragmentMain.class);
			startActivity(i);
			
		}
//		Bundle args = new Bundle();
//		args.putString("Message", "Message from ActivityFragment");
//		
//		newFragment.setArguments(args);
//		//transaction.show(newFragment);
//		
//		
		if(!is){
			transaction = getSupportFragmentManager().beginTransaction();
			transaction.replace(R.id.placeholder, newFragment);
			
			transaction.addToBackStack("mih");
			
			transaction.commit();
		}
		
	}


}
