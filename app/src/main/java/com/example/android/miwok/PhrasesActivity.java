package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> number=new ArrayList<Word>();


        number.add(new Word("where are you going ?","minto wuksus"));
        number.add(new Word("what is your name","tinna oyaasina"));
        number.add(new Word("my name is","oyyasit"));
        number.add(new Word("how are you feeling",",michaksas"));
        number.add(new Word("i'm  feeling good","kuchi achit"));
        number.add(new Word("Are you comming","aanas'aa"));
        number.add(new Word("yes i'm comming","haa'aanam"));
        number.add(new Word("i'm comming","aanam"));



        WordAdapter Adapter = new WordAdapter(this,R.layout.list_item,number,R.color.category_phrases);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

    }
}