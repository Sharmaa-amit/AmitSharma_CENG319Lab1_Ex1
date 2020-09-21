package com.example.amitsharma_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        setStatus("onCreate executed");
    }

    public void onStart()
    {
        super.onStart();
        setStatus("onStart executed");
    }

    public void onStop()
    {
        super.onStop();
        setStatus("onStop executed");
    }

    public void onDestroy()
    {
        super.onDestroy();
        setStatus("onDestroy executed");
    }

    public void setStatus(String status)
    {
        TextView textView = findViewById(R.id.tvStatus);
        textView.append("\n" + status);
    }
}