package com.example.examplefragments;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button switchFragment;
	int state = 0;
	ActionBar abar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		abar = getSupportActionBar();
		
		switchFragment = (Button)this.findViewById(R.id.changeFragment);
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new TestFragment()).commit();
			state = 1;
		}
		
		switchFragment.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(state == 1){
					
					FragmentTransaction fTrag = getSupportFragmentManager().beginTransaction();
					
					fTrag.replace(R.id.container, new NewFragment());
					
					fTrag.commit();
					
					abar = getSupportActionBar();
					abar.setTitle("ActionBar for New Fragment");
					state = 0;
				}else{
					
					FragmentTransaction fTrag = getSupportFragmentManager().beginTransaction();
					
					fTrag.replace(R.id.container, new PlaceholderFragment());
					
					fTrag.commit();
					
					abar = getSupportActionBar();
					abar.setTitle("ActionBar for PlaceHolderFragment");
					state = 1;
				}
			}
		});
		
		
		
		
		
	}


	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			
			return rootView;
		}
	}
	
	
	public static class NewFragment extends Fragment {

		public NewFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			View rootView = inflater.inflate(R.layout.fragment_new, container,
					false);
			
			return rootView;
		}
	}
}
