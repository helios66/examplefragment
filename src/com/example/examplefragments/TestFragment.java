
package com.example.examplefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Akapo Damilola F. [ helios66, fdamilola ]
 *
 * 
 */

public class TestFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		
		final EditText messsage = (EditText)view.findViewById(R.id.message);
		final Button getMessage = (Button)view.findViewById(R.id.getMessage);
		
		
		getMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), messsage.getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
		
		
		return view;
	}

}

