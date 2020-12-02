package com.example.worldskillsolegchabykin.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.worldskillsolegchabykin.R;
import com.example.worldskillsolegchabykin.models.Bankomat;
import com.example.worldskillsolegchabykin.models.Valute;

import java.util.ArrayList;

public class ValuteAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Valute> objects;

    public ValuteAdapter(Context context, ArrayList<Valute> products) {
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
            view = lInflater.inflate(R.layout.item_valute, parent, false);
        }

        Valute p = getProduct(position);

        // заполняем View в пункте списка данными из товаров: наименование, цена
        // и картинка
        ((TextView) view.findViewById(R.id.tvTypeValute)).setText(p.getType());
        ((TextView) view.findViewById(R.id.tvTypeName)).setText(p.getTypeName());
        ((TextView) view.findViewById(R.id.tvBuy)).setText(p.getBuy());
        ((TextView) view.findViewById(R.id.tvSell)).setText(p.getSell());
        return view;
    }

    // товар по позиции
    Valute getProduct(int position) {
        return ((Valute) getItem(position));
    }


}
