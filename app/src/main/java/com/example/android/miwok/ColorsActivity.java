package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> number=new ArrayList<Word>();


        number.add(new Word("red","wetetti",R.drawable.color_red));
        number.add(new Word("mustard yellow","chiwitta",R.drawable.color_mustard_yellow));
        number.add(new Word("dusty yellow","topiisa",R.drawable.color_dusty_yellow));
        number.add(new Word("green","chokokki",R.drawable.color_green));
        number.add(new Word("brown","takaakki",R.drawable.color_brown));
        number.add(new Word("gray","topoppi",R.drawable.color_gray));
        number.add(new Word("black","kenekaku",R.drawable.color_black));
        number.add(new Word("white","kululli",R.drawable.color_white));


        WordAdapter Adapter = new WordAdapter(this,R.layout.list_item,number,R.color.category_colors);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

    }
}