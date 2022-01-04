package com.example.samvel_papyan_android_homeworks.homework8;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.samvel_papyan_android_homeworks.R;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework8_activity_3);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        AppCompatButton showButton = findViewById(R.id.button1);
        AppCompatButton hideButton = findViewById(R.id.button2);

        AppCompatButton getRating  = findViewById(R.id.button3);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        getRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int stars = (int) ratingBar.getRating();
                Toast.makeText(ThirdActivity.this,"Your rate is  " + stars + " stars",Toast.LENGTH_LONG).show();
            }
        });
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
