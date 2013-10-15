package com.example.fragmentwithviewpager;

import java.util.HashMap;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter{

	

	// Variables
	public static final int TAB_INDEX_MENU_1 = 0,
							TAB_INDEX_MENU_2 = 1,
							TAB_INDEX_MENU_12 = 2;
	public static final String TAB_MENU_1 = "TAB_MENU_1";
	public static final String TAB_MENU_2 = "TAB_MENU_2";
	public static final String TAB_MENU_12 = "TAB_MENU_3";
	
	int total_tab = 3;
	
	Context context;
	HashMap<String, Fragment> fragments = new HashMap<String, Fragment>();
	
	public MyViewPagerAdapter(Context ct, FragmentManager fm) {
		super(fm);
		context = ct;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fm = new Fragment();
		switch(position){
		case TAB_INDEX_MENU_1:
			fm = fragments.get(TAB_MENU_1);
			if(fm == null){
				fm = FragmentMenuItem1.newInstance(context);
				fragments.put(TAB_MENU_1, fm);
				
			}
			break;
		case TAB_INDEX_MENU_2:
			fm = fragments.get(TAB_MENU_2);
			if(fm == null){
				fm = FragmentMenuItem2.newInstance(context);
				fragments.put(TAB_MENU_2, fm);
				
			}
			break;
		case TAB_INDEX_MENU_12:
			fm = fragments.get(TAB_MENU_12);
			if(fm == null){
				fm = FragmentMenuItem1.newInstance(context);
				fragments.put(TAB_MENU_12, fm);
				
			}
			break;
		}
		
		
		return fm;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return total_tab;
	}

}
