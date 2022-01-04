package com.example.samvel_papyan_android_homeworks.homework9;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.samvel_papyan_android_homeworks.R;

public class ThirdActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private AppCompatButton button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework9_screen_2_1);
        progressBar = findViewById(R.id.progressBar);
        button = findViewById(R.id.hide_button);
        if(button != null){
            button.setOnClickListener(t->{
                if(progressBar != null){
                    progressBar.setVisibility(View.GONE);
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
