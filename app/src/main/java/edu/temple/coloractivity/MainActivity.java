package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"CYAN","BLUE","RED","BLACK","GRAY","GREEN","MAGENTA","WHITE","YELLOW","PURPLE"};

        Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ColorAdapter myAdapter = new ColorAdapter(this, colors.length, colors);
        colorSpinner.setAdapter(myAdapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ConstraintLayout myLayout = findViewById(R.id.activityLayout);
                TextView textView = (TextView) view;
                myLayout.setBackgroundColor(Color.parseColor(textView.getText().toString()));

                TextView banner = findViewById(R.id.textView);
                if (textView.getText().toString().equals("WHITE")){
                    banner.setTextColor(Color.BLACK);
                } else {
                    banner.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ConstraintLayout myLayout = findViewById(R.id.activityLayout);
                myLayout.setBackgroundColor(Color.WHITE);
            }
        });
    }
}
