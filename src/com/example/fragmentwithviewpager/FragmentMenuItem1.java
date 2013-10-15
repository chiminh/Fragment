package com.example.fragmentwithviewpager;

import com.example.fragment.R;

import android.app.Activity;
import android.content.Context;
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
	public static Fragment newInstance(Context context){
	
		FragmentMenuItem1 menu1 = new FragmentMenuItem1();
		return menu1;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setRetainInstance(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
//		 if(root == null)
//		    	root = (ViewGroup) inflater.inflate(R.layout.fragment_menuitem_1, null, false);
		        
		 return inflater.inflate(R.layout.fragment_menuitem_1, null, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		if(_activity != null){
			
		}
	}
	
}
