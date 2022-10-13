package com.example.android.miwok;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    private Context context;
    private  ArrayList<Word> number;
    private int colors;
    public WordAdapter(Context context, int res, ArrayList<Word> number,int color)
    {
        super(context,res,number);
        this.context = context;
        this.number= number;
        this.colors=color;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        TextView miwokText = convertView.findViewById(R.id.miwok_text);
        TextView defaultText = convertView.findViewById(R.id.default_text);
        ImageView image = convertView.findViewById(R.id.image);

        if(number.get(position).hasImage()) {
            image.setImageResource(number.get(position).getImage());
            image.setVisibility(View.VISIBLE);
        }
        else
            image.setVisibility(View.GONE);

        miwokText.setText(number.get(position).getMIwokTranslation());
        defaultText.setText(number.get(position).getDefaultTranslation());

        View textConatiner =convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colors);
        textConatiner.setBackgroundColor(color);

        return convertView;
    }
}