package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=d22mikwe";
    private final String JSON_FILE = "mountains.json";
    ArrayList<DogItem> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new JsonTask(this).execute(JSON_URL);

    }
}