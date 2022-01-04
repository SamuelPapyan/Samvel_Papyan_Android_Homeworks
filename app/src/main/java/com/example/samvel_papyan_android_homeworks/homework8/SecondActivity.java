package com.example.samvel_papyan_android_homeworks.homework8;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.samvel_papyan_android_homeworks.R;

public class SecondActivity extends AppCompatActivity {
    AppCompatTextView result;
    String str;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework8_activity_2);

        result=findViewById(R.id.textView_enterName);
        str = (String) getIntent().getExtras().get("Value");
        result.setText(str);


        ProgressBar progressBar = findViewById(R.id.progressBar2);
        AppCompatButton showButton = findViewById(R.id.button1);
        AppCompatButton hideButton = findViewById(R.id.button2);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }
}
