package com.example.demonetik_carte;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class AfficheInfo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
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

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			
			EditText montant = (EditText) rootView.findViewById(R.id.Montant);
			EditText nom_porteur = (EditText) rootView.findViewById(R.id.String_nom_porteur);
			EditText num_porteur = (EditText) rootView.findViewById(R.id.String_num_porteur);
			montant.setText(getActivity().getIntent().getExtras().getString("montant") + "�");
			nom_porteur.setText(getActivity().getIntent().getExtras().getString("nom"));
			num_porteur.setText(getActivity().getIntent().getExtras().getString("num"));
			
			return rootView;
		}
	}
}
