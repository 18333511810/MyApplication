package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mybut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybut = (Button) findViewById(R.id.button);
        mybut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mybut.setText("按钮已被点击");
            }
        });

    }
}
