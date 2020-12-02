package com.example.worldskillsolegchabykin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btnMap;
    ImageButton btnExchange;
    Button btnAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMap = (ImageButton) findViewById(R.id.btnMap);
        btnExchange = (ImageButton) findViewById(R.id.btnExchange);
        btnAuth = (Button) findViewById(R.id.btnAuth);
        btnMap.setOnClickListener(this::onClick);
        btnExchange.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnMap:
                intent = new Intent(this, MapActivity.class);
                startActivity(intent);
                break;
            case R.id.btnExchange:
                intent=new Intent(this,ValuteActivity.class);
                startActivity(intent);
                break;
        }
    }
}