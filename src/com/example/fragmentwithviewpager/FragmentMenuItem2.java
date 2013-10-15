package com.example.fragmentwithviewpager;

import com.example.fragment.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMenuItem2 extends Fragment{

	// Variables
	public static final String TAG = "FragmentMenuItem2";
	private Activity _activity;
	ViewGroup root;
	
	// this method will be called by viewPagerAdapter to initialize this fragment
	
	public static Fragment newInstance(){
		FragmentMenuItem2 menu2 = new FragmentMenuItem2();
		return menu2;
	}
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		_activity = activity;
		
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if(root == null)
	    	root = (ViewGroup) inflater.inflate(R.layout.fragment_menuitem_2, null);
	        
	        return root;
	}
	

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		if(_activity != null){
			
		}
	};
}
