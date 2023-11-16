package com.example.project1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project1.R;
import com.example.project1.Options;

import java.util.List;

public class OptionsAdapter extends ArrayAdapter<Options> {
    public OptionsAdapter(@NonNull Context context, int resource, @NonNull List<Options> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected,parent,false);
        TextView itemselected = convertView.findViewById(R.id.itemselected);

        Options options = this.getItem(position);
        if(options != null ){
            itemselected.setText(options.getName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        TextView tv_category = convertView.findViewById(R.id.tv_category);

        Options options = this.getItem(position);
        if(options != null ){
            tv_category.setText(options.getName());
        }
        return convertView;
    }
}
