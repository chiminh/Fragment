package com.example.fragmentwithviewpager;

import com.example.fragment.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;

public class ActivityFragmentMain extends FragmentActivity{

	// 
	MyViewPagerAdapter _adapter;
	ViewPager _viewPager;
	View menu1;
	View menu2;
	
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.fragment_main);
		menu1 = (View) findViewById(R.id.menu_item_1);
		menu2 = (View) findViewById(R.id.menu_item_2);
		
		
		setUpView();
		setTab();
	}
	
	public void setUpView(){
		_viewPager = (ViewPager) findViewById(R.id.viewPager);
		
		_adapter = new MyViewPagerAdapter(getApplicationContext(), getSupportFragmentManager());
		_viewPager.setAdapter(_adapter);
		_viewPager.setCurrentItem(MyViewPagerAdapter.TAB_INDEX_MENU_1);
		focusOnTab(MyViewPagerAdapter.TAB_INDEX_MENU_1);
	}
	public void setTab(){
		_viewPager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				focusOnTab(arg0);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void focusOnTab(int position){
		switch(position){
		case MyViewPagerAdapter.TAB_INDEX_MENU_1:
			findViewById(R.id.image_item1).setVisibility(View.VISIBLE);
			findViewById(R.id.image_item2).setVisibility(View.INVISIBLE);
			break;
		case MyViewPagerAdapter.TAB_INDEX_MENU_2:
			findViewById(R.id.image_item1).setVisibility(View.INVISIBLE);
			findViewById(R.id.image_item2).setVisibility(View.VISIBLE);
			break;
		}
	}
	
	
	
}
