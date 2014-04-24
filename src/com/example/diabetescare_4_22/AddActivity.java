package com.example.diabetescare_4_22;

import com.example.diabetescare_4_4.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
			
			
		}

		ListView listView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_add, container,
					false);
			populateListView(rootView);
			registerClickCallBack(rootView);

			return rootView;
		}

		private void populateListView(View rootView) {
			listView = (ListView) rootView.findViewById(R.id.listView1);
			String[] items = getActivity().getResources().getStringArray(
					R.array.itemsArray);
			// build adapter
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(
					getActivity(), // context
					R.layout.items, // layout to use
					items); // items to be displayed

			listView.setAdapter(adapter);
		}

		private void registerClickCallBack(View rootView) {
			listView = (ListView) rootView.findViewById(R.id.listView1);
			listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				Fragment nf;
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
                   
					if (position == 0) {
						nf= new AddFoodFragment();
					}
					if (position == 1) {
						nf = new AddSportFragment();
					}
					if (position == 2) {
						nf = new AddGlucoseFragment();
					}
					if (position == 3) {
						nf = new AddInsulinFragment();
					}
					
					FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
					
					transaction.replace(R.id.fragement_placeholder, nf);
					//transaction.addToBackStack("registerClickCallBack");
					transaction.commit();

					

				}
			});

		}

	}

}
