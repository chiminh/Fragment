package com.example.fragmentwithviewpager;

import com.example.fragment.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMenuItem1 extends Fragment{

	// Variables
	public static final String TAG = "FragmentMenuItem1";
	private Activity _activity;
	ViewGroup root;
	public static Fragment newInstance(){
	
		FragmentMenuItem1 menu1 = new FragmentMenuItem1();
		return menu1;
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
		    	root = (ViewGroup) inflater.inflate(R.layout.fragment_menuitem_1, null);
		        
		        return root;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		if(_activity != null){
			
		}
	}
	
}
