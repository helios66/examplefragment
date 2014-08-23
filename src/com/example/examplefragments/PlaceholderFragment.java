
package com.example.examplefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Akapo Damilola F. [ helios66, fdamilola ]
 *
 * 
 */

/**
 * A placeholder fragment containing a simple view.
 */
@Deprecated
public class PlaceholderFragment extends Fragment {

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
