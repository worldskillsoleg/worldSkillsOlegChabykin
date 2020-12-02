package com.example.worldskillsolegchabykin.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.worldskillsolegchabykin.R;
import com.example.worldskillsolegchabykin.models.Bankomat;

import java.util.ArrayList;

public class BankomatAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Bankomat> objects;

    public BankomatAdapter(Context context, ArrayList<Bankomat> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // кол-во элементов
    @Override
    public int getCount() {
        return objects.size();
    }

    // элемент по позиции
    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    // id по позиции
    @Override
    public long getItemId(int position) {
        return position;
    }

    // пункт списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // используем созданные, но не используемые view
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.item_bankomat, parent, false);
        }

        Bankomat p = getProduct(position);

        // заполняем View в пункте списка данными из товаров: наименование, цена
        // и картинка
        ((TextView) view.findViewById(R.id.tvAddress)).setText(p.getAddress());
        ((TextView) view.findViewById(R.id.tvType)).setText(p.getType() + "");
        ((TextView) view.findViewById(R.id.tvWorkingTime)).setText(p.getWorkingTime());
        if (p.isWorking()){
            ((TextView) view.findViewById(R.id.tvIsWorking)).setText("Работает");
            ((TextView) view.findViewById(R.id.tvIsWorking)).setTextColor(Color.GREEN);
        }else {
            ((TextView) view.findViewById(R.id.tvIsWorking)).setText("Закрыто");
            ((TextView) view.findViewById(R.id.tvIsWorking)).setTextColor(Color.RED);
        }
        return view;
    }

    // товар по позиции
    Bankomat getProduct(int position) {
        return ((Bankomat) getItem(position));
    }



}
