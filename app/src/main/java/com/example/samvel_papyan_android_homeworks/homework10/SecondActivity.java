package com.example.samvel_papyan_android_homeworks.homework10;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samvel_papyan_android_homeworks.R;

public class SecondActivity extends AppCompatActivity {

    private RCAdapter rcAdapter = new RCAdapter();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework10_list);
        setOwnActionBar();
        initRecyclerView();
        setSpinnerAdapter();
    }

    private void setOwnActionBar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.my_own_toolbar);
        setActionBar(toolbar);
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.rcView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        rcAdapter.setItems(ListItem.getListItems());
        recyclerView.setAdapter(rcAdapter);
    }

    public void setSpinnerAdapter(){
        AppCompatSpinner spinner = findViewById(R.id.my_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                SecondActivity.this,
                R.array.cities,
                android.R.layout.simple_spinner_item
        );
        spinner.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
