package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

public class FragmentStart extends Fragment{

	
	// Variables
		public static final String TAG = "Fragment start";
		private Activity _activity;
		int i = 0;
		@Override
		public void onAttach(Activity activity) {
			// TODO Auto-generated method stub
			Log.i(TAG , "onAttach");
			_activity = activity;
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
		
		return inflater.inflate(R.layout.fragment_start, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i(TAG , "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
		
		i++;
		
		Bundle bundle = this.getArguments();
		String message = null;
		if(bundle != null){
			message = bundle.getString("Message");
		}
		TextView textview = (TextView) _activity.findViewById(R.id.textViewstart);
		textview.setText(message + i);
	}
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i(TAG , "onDestroy");
		super.onDestroy();
	}
}
