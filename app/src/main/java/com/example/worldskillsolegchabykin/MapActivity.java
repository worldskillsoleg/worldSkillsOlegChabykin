package com.example.worldskillsolegchabykin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.worldskillsolegchabykin.adapters.BankomatAdapter;
import com.example.worldskillsolegchabykin.models.Bankomat;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    ListView bankomatList;
    BankomatAdapter bankomatAdapter;
    ArrayList<Bankomat> list=new ArrayList<Bankomat>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        bankomatList=(ListView) findViewById(R.id.bankomatList);
        fillData();
        bankomatAdapter=new BankomatAdapter(this,list);
        bankomatList.setAdapter(bankomatAdapter);
    }
    private void fillData(){
        for (int i=0;i<10;i++){
            list.add(new Bankomat("Якутск ул.Ленина","Банкомат",true,"09:00-20:00"));
        }
        list.add(new Bankomat("Якутск ул.Ленина","Банкомат",false,"00:00-00:00"));
    }
}