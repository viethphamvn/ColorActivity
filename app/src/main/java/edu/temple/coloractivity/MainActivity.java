package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"CYAN","BLUE","RED"};

        Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ColorAdapter myAdapter = new ColorAdapter(this, colors.length, colors);
        colorSpinner.setAdapter(myAdapter);
    }
}
