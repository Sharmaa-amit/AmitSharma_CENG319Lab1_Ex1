package com.example.amitsharma_ceng319lab1_ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Toast.makeText(getActivity(), "bottom onCreateView executed", Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    public void onStart()
    {
        super.onStart();
        Toast.makeText(getActivity(), "bottom onStart executed", Toast.LENGTH_SHORT).show();
    }
}