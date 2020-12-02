package com.example.worldskillsolegchabykin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.worldskillsolegchabykin.adapters.ValuteAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ValuteActivity extends AppCompatActivity {
ValuteAdapter valuteAdapter;
ArrayList<cbValute> list=new ArrayList<cbValute>();
ListView listValute;
TextView tvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valute);
        listValute=findViewById(R.id.listValute);
        tvDate=(TextView) findViewById(R.id.tvDate);
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        String formattedDate = df.format(c);
        tvDate.setText(formattedDate);
        fillData();
        valuteAdapter=new ValuteAdapter(this,list);
        listValute.setAdapter(valuteAdapter);
    }
    private void fillData(){
        for (int i=0;i<5;i++){
            list.add(new cbValute("USD","Американский доллар","64,95","64,95"));

        }
    }
}