package com.simon.androiddemo002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButton();
    }
    private void setButton()
    {
        Button button = findViewById(R.id.button_id);
        Button button1 = findViewById(R.id.button2_id);
        TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(v -> {
            i++;
            String data= String.valueOf(i);
            textView.setText(data);
        });
        button1.setOnClickListener(v -> {
            i--;
            String data=String.valueOf(i);
            textView.setText(data);
        });
    }
    //onCreate， onStart, onResume,  onPause, onStop, onRestart, onDestroy
}