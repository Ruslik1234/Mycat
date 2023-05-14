package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getbg(View view){
        Intent intent = new Intent(MainActivity.this, CatActivity.class);
        startActivity(intent);
        //переход на активность с моим котом
    }
}
