package com.example.amitsharma_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class TopFragment extends ListFragment {

    String[] activityList = new String[]{"AIActivity", "VRActivity"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, activityList);
        setListAdapter(adapter);

        Toast.makeText(getActivity(), "top onCreateView executed", Toast.LENGTH_SHORT).show();

        return view;
    }

    public void onStart()
    {
        super.onStart();
        Toast.makeText(getActivity(), "top onStart executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent;

        if (position == 0)
            intent = new Intent(v.getContext(), AIActivity.class);

        else
            intent = new Intent(v.getContext(), VRActivity.class);

        startActivity(intent);
    }
}