package com.example.samvel_papyan_android_homeworks.homework6;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;

import com.example.samvel_papyan_android_homeworks.R;

public class MatchActivity extends AppCompatActivity {
    private SwitchCompat match_alerts_switch;
    private SwitchCompat fav_match_switch;
    private SwitchCompat fav_league_switch;
    private AppCompatTextView preferences;
    private AppCompatTextView football;
    private AppCompatTextView tennis;
    private AppCompatTextView basketball;
    private AppCompatTextView hockey;
    private AppCompatTextView cricket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_6_notification_constraint_layout);
        match_alerts_switch = findViewById(R.id.match_alerts_switch);
        fav_match_switch = findViewById(R.id.fav_match_switch);
        fav_league_switch = findViewById(R.id.fav_league_switch);
        preferences = findViewById(R.id.preferences);
        football = findViewById(R.id.football);
        tennis = findViewById(R.id.tennis);
        basketball = findViewById(R.id.basketball);
        hockey = findViewById(R.id.hockey);
        cricket = findViewById(R.id.cricket);

        if(match_alerts_switch != null){
            match_alerts_switch.setOnCheckedChangeListener((swtch,isChecked)->{
                if(isChecked)
                    Toast.makeText(MatchActivity.this, "Match alerts turned on",Toast.LENGTH_LONG);
                else
                    Toast.makeText(MatchActivity.this, "Match alerts turned off",Toast.LENGTH_LONG);
            });
        }

        if(fav_match_switch != null){
            fav_match_switch.setOnCheckedChangeListener((swtch,isChecked)->{
                if(isChecked)
                    Toast.makeText(MatchActivity.this, "Favorite match notification turned on",Toast.LENGTH_LONG);
                else
                    Toast.makeText(MatchActivity.this, "Favorite match notification turned off",Toast.LENGTH_LONG);
            });
        }
        if(fav_league_switch != null){
            fav_league_switch.setOnCheckedChangeListener((swtch,isChecked)->{
                if(isChecked)
                    Toast.makeText(MatchActivity.this, "Favorite league notification turned on",Toast.LENGTH_LONG);
                else
                    Toast.makeText(MatchActivity.this, "Favorite league notification turned off",Toast.LENGTH_LONG);
            });
        }
        if(preferences != null){
            preferences.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Preferences",Toast.LENGTH_LONG);
            });
        }
        if(football != null){
            football.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Football",Toast.LENGTH_LONG);
            });
        }
        if(tennis != null){
            tennis.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Tennis",Toast.LENGTH_LONG);
            });
        }
        if(basketball != null){
            basketball.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Basketball",Toast.LENGTH_LONG);
            });
        }
        if(hockey != null){
            hockey.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Hockey",Toast.LENGTH_LONG);
            });
        }
        if(cricket != null){
            cricket.setOnClickListener(t->{
                Toast.makeText(MatchActivity.this,"Cricket",Toast.LENGTH_LONG);
            });
        }
    }
}
