package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment02 extends Fragment{

	// Variables
	public static final String TAG = "Fragment02";
	private Activity _activity;
	int i = 0;
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		_activity = activity;
		Log.i(TAG , "onAttach");
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i(TAG , "onCreate");
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i(TAG , "onCreateView");
		return inflater.inflate(R.layout.fragment_02, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i(TAG , "onActivityCreated");
		i ++;
		TextView textview = (TextView) _activity.findViewById(R.id.textView02);
		textview.setText("textView Fragment 02" + i);
		super.onActivityCreated(savedInstanceState);
	}
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i(TAG , "onDestroy");
		super.onDestroy();
	}
}
