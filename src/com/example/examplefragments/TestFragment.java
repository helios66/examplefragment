
package com.example.examplefragments;


import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * @author Akapo Damilola F. [ helios66, fdamilola ]
 *
 * 
 */

public class TestFragment extends Fragment {

	final String PREF_NAME = "SAVEALL"; 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_main, container, false);

		final Button saveString = (Button)view.findViewById(R.id.saveString);
		final Button getString = (Button)view.findViewById(R.id.getString);
		
		final EditText firstText = (EditText)view.findViewById(R.id.firstText);
		final EditText secondText = (EditText)view.findViewById(R.id.secondText);
		
		saveString.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				String value = firstText.getText().toString();
//				SharedPreferences spref = getActivity().getSharedPreferences(PREF_NAME, 0);
//				SharedPreferences.Editor editor = spref.edit();
//				editor.putString("TEXT", value);
//				editor.commit();
				
				new AsyncTaskClass().execute();
				
			}
		});

		getString.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences spref = getActivity().getSharedPreferences(PREF_NAME, 0);
				String value = spref.getString("TEXT", "This is a default value");
				secondText.setText(value);
			}
		});
		
		return view;
	}


	private class AsyncTaskClass extends AsyncTask<String, Void, Void>{
		
		private ProgressDialog pdialog;
		
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			pdialog = new ProgressDialog(getActivity());
			pdialog.setMessage("This is an AsyncTask");
			pdialog.show();
			
		}

		@Override
		protected Void doInBackground(String... params) {
			// TODO Auto-generated method stub
			try{
				Thread.sleep(5000);
			}catch(Exception n){
				n.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			pdialog.dismiss();
			
		}
		
		
	}
	
	

}

