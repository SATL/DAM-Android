package com.fpmislata.practicas.pmdm_t4a11_alzate_eslem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eslem on 10/19/2016.
 */

public class MiArrayAdapter<T> extends ArrayAdapter<T> {

    public MiArrayAdapter(Context context, List<T> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = convertView;
        if (null == convertView) {
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }
        TextView titulo = (TextView)listItemView.findViewById(R.id.text1);
        TextView desc = (TextView)listItemView.findViewById(R.id.text2);
        TextView price = (TextView)listItemView.findViewById(R.id.text3);
        ImageView categoria = (ImageView)listItemView.findViewById(R.id.category);
        Food item = (Food) getItem(position);
        titulo.setText(item.getName());
        desc.setText(item.getDecription());
        price.setText("RS "+item.getPrice());
        categoria.setImageResource(item.getImage());
        return listItemView;
    }
}
