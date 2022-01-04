package com.example.samvel_papyan_android_homeworks.homework6;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;

import com.example.samvel_papyan_android_homeworks.R;

public class MainActivity extends AppCompatActivity {
    private AppCompatRadioButton spicy;
    private AppCompatRadioButton original;
    private AppCompatCheckBox cheese1;
    private AppCompatCheckBox cheese2;
    private AppCompatCheckBox cheese3;
    private AppCompatButton add_to_cart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_homework_6_constraint_layout);
        spicy = findViewById(R.id.type_spicy);
        original = findViewById(R.id.type_original);
        cheese1 = findViewById(R.id.cheese1);
        cheese2 = findViewById(R.id.cheese2);
        cheese3 = findViewById(R.id.cheese3);
        add_to_cart = findViewById(R.id.add_to_cart);

        if(spicy != null){
            spicy.setOnClickListener(v->{
                Toast.makeText(MainActivity.this, "Spicy Twister",Toast.LENGTH_LONG);
            });
        }
        if(original != null){
            original.setOnClickListener(v->{
                Toast.makeText(MainActivity.this, "Original Twister",Toast.LENGTH_LONG);
            });
        }
        if(cheese1 != null){
            cheese1.setOnCheckedChangeListener((buttonView,isChecked)->{
                if(isChecked)
                    Toast.makeText(MainActivity.this, "+1 Cheese", Toast.LENGTH_LONG);
                else
                    Toast.makeText(MainActivity.this, "-1 Cheese", Toast.LENGTH_LONG);
            });
        }
        if(cheese2 != null){
            cheese2.setOnCheckedChangeListener((buttonView,isChecked)->{
                if(isChecked)
                    Toast.makeText(MainActivity.this, "+2 Cheese", Toast.LENGTH_LONG);
                else
                    Toast.makeText(MainActivity.this, "-2 Cheese", Toast.LENGTH_LONG);
            });
        }
        if(cheese3 != null){
            cheese3.setOnCheckedChangeListener((buttonView,isChecked)->{
                if(isChecked)
                    Toast.makeText(MainActivity.this, "+3 Cheese", Toast.LENGTH_LONG);
                else
                    Toast.makeText(MainActivity.this, "-3 Cheese", Toast.LENGTH_LONG);
            });
        }
        if(add_to_cart != null){
            add_to_cart.setOnClickListener(v->{
                Toast.makeText(MainActivity.this,"Twister is ordered.",Toast.LENGTH_LONG);
            });
        }
    }
}
