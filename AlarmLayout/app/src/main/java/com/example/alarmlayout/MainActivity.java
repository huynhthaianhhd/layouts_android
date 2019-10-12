package com.example.alarmlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvClock;
    ArrayList<clock> arrayClock;
    ClockAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        adapter = new ClockAdapter(this,R.layout.rows_clock,arrayClock);
        lvClock.setAdapter(adapter);
    }
    private void Init(){
        lvClock=(ListView) findViewById(R.id.lv1);
        arrayClock=new ArrayList<>();
        arrayClock.add(new clock("04:45","Tue,Oct 1"));
        arrayClock.add(new clock("12:43","Tue,Oct 1"));
        arrayClock.add(new clock("15:35","Mon,Sep 30"));
        arrayClock.add(new clock("21:00","Mon,Sep 30"));

    }
}
