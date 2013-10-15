package com.example.fragmentwithviewpager;

import com.example.fragment.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMenuItem12 extends Fragment{

	
	ViewGroup root;
	
	public static Fragment newInstance(Context context){
		FragmentMenuItem12 fm = new FragmentMenuItem12();
		
		return fm;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
//		if(root == null){
//			root = (ViewGroup) inflater.inflate(R.layout.fragment_menuitem_12, null, false);
//		}
		return inflater.inflate(R.layout.fragment_menuitem_12, null, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
}
