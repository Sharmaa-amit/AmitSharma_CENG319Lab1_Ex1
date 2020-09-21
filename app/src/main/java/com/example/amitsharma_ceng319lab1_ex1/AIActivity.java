package com.example.amitsharma_ceng319lab1_ex1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        TextView textView = findViewById(R.id.tvStatus);
        textView.append("\nonCreate executed");
    }

    public void onStart()
    {
        super.onStart();
        TextView textView = findViewById(R.id.tvStatus);
        textView.append("\nonStart executed");
    }

    public void onStop()
    {
        super.onStop();
        TextView textView = findViewById(R.id.tvStatus);
        textView.append("\nonStop executed");
    }

    public void onDestroy()
    {
        super.onDestroy();
        TextView textView = findViewById(R.id.tvStatus);
        textView.append("\nonDestroy executed");
    }
}