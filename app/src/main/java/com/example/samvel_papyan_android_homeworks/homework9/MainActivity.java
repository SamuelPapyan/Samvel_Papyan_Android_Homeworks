package com.example.samvel_papyan_android_homeworks.homework9;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.samvel_papyan_android_homeworks.R;

public class MainActivity extends AppCompatActivity {
    private AppCompatEditText editText;
    private AppCompatButton button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework9_screen_1_1);

        editText = findViewById(R.id.my_edit_text);
        button = findViewById(R.id.my_button);

        if(button != null){
            button.setOnClickListener(v->{
                Intent intent = new Intent(
                        this,
                        SecondActivity.class
                );
                if(editText != null) {
                    intent.putExtra("my_text", editText.getText().toString());
                    startActivity(intent);
                }
            });
        }
    }
}
