package com.example.samvel_papyan_android_homeworks.homework8;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import com.example.samvel_papyan_android_homeworks.R;

public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework8_activity_4);
        setSpinnerAdapter();
    }

    private void setSpinnerAdapter() {
        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.colors_array,
                android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        AppCompatTextView textView = findViewById(R.id.textView_spinner);

        Context context = this;

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

                switch (position){

                    case 0: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.light_red));
                    }
                    case 1: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.light_blue));
                    }
                    case 2: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.yellow));
                    }
                    case 3: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.light_green));
                    }
                    case 4: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.black));
                    }
                    case 5: {
                        textView.setTextColor(ContextCompat.getColor(context, R.color.grey));
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
