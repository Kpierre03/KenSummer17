package com.example.kpp2.kensummer17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kpp2.kensummer17.R;

public class LaunchModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
    }
}
