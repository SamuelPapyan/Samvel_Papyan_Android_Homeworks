package com.example.samvel_papyan_android_homeworks.homework6;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;

import com.example.samvel_papyan_android_homeworks.R;

public class SettingsActivity extends AppCompatActivity {
    private AppCompatTextView change_pass;
    private SwitchCompat set_pin_switch;
    private SwitchCompat close_block_switch;
    private AppCompatTextView change_lang;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_6_settings_constraint_layout);
        change_pass = findViewById(R.id.change_pass);
        set_pin_switch = findViewById(R.id.set_pin_switch);
        close_block_switch = findViewById(R.id.close_block_switch);
        change_lang = findViewById(R.id.change_lang);

        if(change_pass != null){
            change_pass.setOnClickListener(t->{
                Toast.makeText(SettingsActivity.this,"Change Password",Toast.LENGTH_LONG);
            });
        }

        if(change_lang != null){
            change_lang.setOnClickListener(t->{
                Toast.makeText(SettingsActivity.this,"Change Language",Toast.LENGTH_LONG);
            });
        }

        if(set_pin_switch != null){
            set_pin_switch.setOnCheckedChangeListener((swtch,isChecked)->{
                if(isChecked)
                    Toast.makeText(SettingsActivity.this, "Pin code sets on",Toast.LENGTH_LONG);
                else
                    Toast.makeText(SettingsActivity.this, "Pin code sets off",Toast.LENGTH_LONG);
            });
        }

        if(close_block_switch != null){
            close_block_switch.setOnCheckedChangeListener((swtch,isChecked)->{
                if(isChecked)
                    Toast.makeText(SettingsActivity.this, "Blocking closed",Toast.LENGTH_LONG);
                else
                    Toast.makeText(SettingsActivity.this, "Blocking opened",Toast.LENGTH_LONG);
            });
        }
    }
}
