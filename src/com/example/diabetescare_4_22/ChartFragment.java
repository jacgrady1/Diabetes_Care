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

public class ChartFragment extends Fragment {
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
				
		view= inflater.inflate(R.layout.fragment_chart_alone , container,false);
		
		
//		ChartView chartView = (ChartView)view.findViewById(R.id.chart_view);
//
//		// Create the data points
//		LinearSeries series = new LinearSeries();
//		series.setLineColor(0xFF0099CC);
//		series.setLineWidth(2);
//
//		for (double i = 0d; i <= (2d * Math.PI); i += 0.1d) {
//			series.addPoint(new LinearPoint(i, Math.cos(i)));
//		}
//
//		// Add chart view data
//		chartView.addSeries(series);
//		chartView.setLeftLabelAdapter(new ValueLabelAdapter(getActivity(), LabelOrientation.VERTICAL));
//		chartView.setBottomLabelAdapter(new ValueLabelAdapter(getActivity(), LabelOrientation.HORIZONTAL));
//	
//		
		
		return view;
		
		
	}

}

