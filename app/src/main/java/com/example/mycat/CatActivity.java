package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        textView = findViewById(R.id.textView4);
        textView.setText("Это мой кот бакс ,очень крутой кот ,ему 4 года,ласковый иногда игривый");
    }
}