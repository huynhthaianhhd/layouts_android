package com.example.layoutcaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvButton;
    ArrayList<button_num> arrayButton;
    AdapterButton adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        adapter=new AdapterButton(this,R.layout.button_num,arrayButton);
        gvButton.setAdapter(adapter);
    }
    private void Init()
    {
        gvButton=(GridView)findViewById(R.id.gv1);
        arrayButton=new ArrayList<>();
        arrayButton.add(new button_num("C"));
        arrayButton.add(new button_num("()"));
        arrayButton.add(new button_num("%"));
        arrayButton.add(new button_num("÷"));
        arrayButton.add(new button_num("7"));
        arrayButton.add(new button_num("8"));
        arrayButton.add(new button_num("9"));
        arrayButton.add(new button_num("x"));
        arrayButton.add(new button_num("4"));
        arrayButton.add(new button_num("5"));
        arrayButton.add(new button_num("6"));
        arrayButton.add(new button_num("-"));
        arrayButton.add(new button_num("1"));
        arrayButton.add(new button_num("2"));
        arrayButton.add(new button_num("3"));
        arrayButton.add(new button_num("+"));
        arrayButton.add(new button_num("+/-"));
        arrayButton.add(new button_num("0"));
        arrayButton.add(new button_num("."));
        arrayButton.add(new button_num("="));


    }
}
