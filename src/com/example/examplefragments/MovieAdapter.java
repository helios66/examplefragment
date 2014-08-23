
package com.example.examplefragments;

import java.util.ArrayList;

import com.example.examplefragments.TestFragment.MovieItems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * @author Akapo Damilola F. [ helios66, fdamilola ]
 *
 * 
 */

public class MovieAdapter extends ArrayAdapter<MovieItems> {

	private Context ctx;
	private int res;
	private ArrayList<MovieItems> data;

	public MovieAdapter(Context context, int resource, ArrayList<MovieItems> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.ctx = context;
		this.res = resource;
		this.data = objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = convertView;

		if (v == null){
			LayoutInflater vi = (LayoutInflater)this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(this.res, null);
		}
		
		ImageView movieImage = (ImageView)v.findViewById(R.id.movieImage);
		TextView movieTitle = (TextView)v.findViewById(R.id.movieTitle);
		TextView movieDesc = (TextView)v.findViewById(R.id.movieDesc);
		
		MovieItems s = getItem(position);
		
		movieImage.setImageResource(s.getImage());
		movieTitle.setText(s.getMovieTitle());
		movieDesc.setText(s.getMovieDescription());

		return v;

	}
	
	public MovieItems getItem(int i){
		return this.data.get(i);
	}

}
