package com.example.samvel_papyan_android_homeworks.homework8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.samvel_papyan_android_homeworks.R;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    Button enterButton;
    String name;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework8_activity_1);

        editName = findViewById(R.id.editName);
        enterButton= findViewById(R.id.enter_button);


        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                name = editName.getText().toString();
                intent.putExtra("Value", name);
                startActivity(intent);
            }
        });

    }
}
