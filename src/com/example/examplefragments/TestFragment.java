
package com.example.examplefragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;

/**
 * @author Akapo Damilola F. [ helios66, fdamilola ]
 *
 * 
 */

public class TestFragment extends Fragment {

	ListView lView;
	static ArrayList<MovieItems> arrayListItems;
	MovieAdapter aAdapter;

	static{
		arrayListItems = new ArrayList<MovieItems>();
		arrayListItems.add(new MovieItems(R.drawable.ic_launcher, "CodeCamp Movie.", "The Life and Times of A Rain Drops Dude."));
		arrayListItems.add(new MovieItems(R.drawable.ic_launcher, "Caleb Mbakwe.", "And the milk finished!!"));
		arrayListItems.add(new MovieItems(R.drawable.ic_launcher, "Leye's Movie.", "1500 Lines of Code."));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_main, container, false);

		lView = (ListView)view.findViewById(R.id.listView);

		aAdapter = new MovieAdapter(getActivity(), R.layout.movie_item, arrayListItems);

		lView.setAdapter(aAdapter);


		aAdapter.notifyDataSetChanged();

		return view;
	}


	static public class MovieItems{
		private int image;
		private String movieTitle, movieDescription;

		public MovieItems(int image, String title, String desc){
			this.image = image;
			this.movieTitle = title;
			this.movieDescription = desc;
		}

		public int getImage() {
			return image;
		}
		public void setImage(int image) {
			this.image = image;
		}
		public String getMovieTitle() {
			return movieTitle;
		}
		public void setMovieTitle(String movieTitle) {
			this.movieTitle = movieTitle;
		}
		public String getMovieDescription() {
			return movieDescription;
		}
		public void setMovieDescription(String movieDescription) {
			this.movieDescription = movieDescription;
		}

	}

}

