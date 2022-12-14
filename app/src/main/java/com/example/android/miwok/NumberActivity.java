package com.example.android.miwok;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> number=new ArrayList<Word>();
        number.add(new Word("one","lutti",R.drawable.number_one));
        number.add(new Word("two","otiiko",R.drawable.number_two));
        number.add(new Word("three","tolookasu",R.drawable.number_three));
        number.add(new Word("four","oyyisa",R.drawable.number_four));
        number.add(new Word("five","massokka",R.drawable.number_five));
        number.add(new Word("six","temmokka",R.drawable.number_six));
        number.add(new Word("seven","kenekaku",R.drawable.number_seven));
        number.add(new Word("eight","kawinta",R.drawable.number_eight));
        number.add(new Word("nine","wo'e",R.drawable.number_nine));
        number.add(new Word("ten","na'aacha",R.drawable.number_ten));


        WordAdapter Adapter = new WordAdapter(this,R.layout.list_item,number,R.color.category_numbers);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

    }
}