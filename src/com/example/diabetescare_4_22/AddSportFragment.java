package com.example.diabetescare_4_22;

import com.example.diabetescare_4_4.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class AddSportFragment extends Fragment {
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
				
		view= inflater.inflate(R.layout.fragment_sport_detail , container,false);
		
		
		
		
		
		/*
		Button btn=(Button)view.findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				EditText in=(EditText)view.findViewById(R.id.editEmail);
				String email=in.getText().toString();
				TextView out=(TextView)view.findViewById(R.id.textEmail);
				out.setText(email);
			}
		});
		*/
		return view;
		
		
	}

}

