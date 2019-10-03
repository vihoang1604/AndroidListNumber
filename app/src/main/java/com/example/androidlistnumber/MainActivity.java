package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    int[] arrNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        arrNumber = new int[100];
        for(int i = 1; i <= arrNumber.length ; i++){
            arrNumber[i] = i;
        }

        NumberAdapter numberAdapter = new NumberAdapter();
        numberAdapter.arrNumber = arrNumber;
        recyclerview.setAdapter(numberAdapter);
    }
}
